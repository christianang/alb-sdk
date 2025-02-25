// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package test

import (
	"fmt"
	"os"
	"testing"

	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

func TestCreateProfiles(t *testing.T) {
	aviClient, err := clients.NewAviClient(os.Getenv("AVI_CONTROLLER"), os.Getenv("AVI_USERNAME"),
		session.SetPassword(os.Getenv("AVI_PASSWORD")),
		session.SetTenant(os.Getenv("AVI_TENANT")),
		session.SetVersion(os.Getenv("AVI_VERSION")),
		session.SetInsecure)

	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		t.Fail()
	}
	cv, err := aviClient.AviSession.GetControllerVersion()
	fmt.Printf("Avi Controller Version: %v:%v\n", cv, err)

	// Create application persistence in avinetworks tenant
	profileobj := models.ApplicationPersistenceProfile{}
	ifed := false
	profileobj.IsFederated = &ifed
	pt := "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS"
	profileobj.PersistenceType = &pt
	name := "Test-Persistece-Profile"
	profileobj.Name = &name
	tr := "/api/tenant?name=admin"
	profileobj.TenantRef = &tr
	ipt := (int32)(5)
	ipobj := models.IPPersistenceProfile{IPPersistentTimeout: &ipt}
	profileobj.IPPersistenceProfile = &ipobj
	npobj, err := aviClient.ApplicationPersistenceProfile.Create(&profileobj)
	if err != nil {
		fmt.Println("\n Application persistence profile creation failed: ", err)
		t.Fail()
	}
	fmt.Println("\n Application persistence profile ", npobj)

	// Create ssl profile in avinetworks tenant
	sslobj := models.SSLProfile{}
	name = "Test-Ssl-Profile"
	sslobj.Name = &name
	tr = "/api/tenant?name=admin"
	sslobj.TenantRef = &tr
	essr := true
	sslobj.EnableSslSessionReuse = &essr
	sst := (uint32)(86400)
	sslobj.SslSessionTimeout = &sst
	pcco := false
	sslobj.PreferClientCipherOrdering = &pcco
	scn := true
	sslobj.SendCloseNotify = &scn
	ac := "ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES128-SHA:ECDHE-ECDSA-AES256-SHA:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-ECDSA-AES128-SHA256:ECDHE-ECDSA-AES256-SHA384:AES128-GCM-SHA256:AES256-GCM-SHA384:AES128-SHA256:AES256-SHA256:AES128-SHA:AES256-SHA:DES-CBC3-SHA"
	sslobj.AcceptedCiphers = &ac
	Type := "SSL_VERSION_TLS1"
	vobj := models.SSLVersion{Type: &Type}
	sslobj.AcceptedVersions = append(sslobj.AcceptedVersions, &vobj)

	profobj, err := aviClient.SSLProfile.Create(&sslobj)
	if err != nil {
		fmt.Println("\n Ssl profile creation failed: ", err)
		t.Fail()
	} else {
		fmt.Println("Ssl profile ", profobj)
	}

}
