package com.bootcamp.ECommerceApplication.co;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class SellerCO extends UserCO {
    //VALID GST NUMBER - 37adapm1724a2Z6
    @NotNull(message = "Please provide GST number")
    @Pattern(regexp = "^([0]{1}[1-9]{1}|[1-2]{1}[0-9]{1}|[3]{1}[0-7]{1})([a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}[1-9a-zA-Z]{1}[zZ]{1}[0-9a-zA-Z]{1})+$",
            message = "Please provide valid GST number as per Govt. norms")
    private String gst;

    //This Pattern is to Validate Mobile Number with 10 digit Number and Countrycode as Optional, And check for Landline Numbers as well.
    @Pattern(regexp = "^(?:\\s+|)((0|(?:(\\+|)91))(?:\\s|-)*(?:(?:\\d(?:\\s|-)*\\d{9})|(?:\\d{2}(?:\\s|-)*\\d{8})|(?:\\d{3}(?:\\s|-)*\\d{7}))|\\d{10})(?:\\s+|)$"
            , message = "Please provide valid Contact No.")
    @NotNull(message = "Please provide Company Contact")
    private String companyContact;

    @NotNull(message = "Please provide Company Name")
    @NotBlank(message = "Please provide valid Company Name")
    private String companyName;

    private List<AddressCO> addresses;


    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<AddressCO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressCO> addresses) {
        addresses.forEach(e -> e.setUserCO(this));
        this.addresses = addresses;
    }
}