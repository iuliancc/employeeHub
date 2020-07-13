package com.threedi.hub.employeeHub.fileDomain;


 class Address {

    private final String addressLine1 ;
    private final String addressLine2 ;
    private final String addressTown  ;
    private final String addressPostCode ;
    private final String addressCountry ;

     public Address(String addressLine1, String addressLine2, String addressTown, String addressPostCode, String addressCountry) {

         this.addressLine1 = addressLine1;
         this.addressLine2 = addressLine2;
         this.addressTown = addressTown;
         this.addressPostCode = addressPostCode;
         this.addressCountry = addressCountry;
     }

     public String getAddressLine1() {
         return addressLine1;
     }

     public String getAddressLine2() {
         return addressLine2;
     }

     public String getAddressTown() {
         return addressTown;
     }

     public String getAddressPostCode() {
         return addressPostCode;
     }

     public String getAddressCountry() {
         return addressCountry;
     }
 }
