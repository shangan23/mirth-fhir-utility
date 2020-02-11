package mirthjsonpath;
import java.util.List;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String json =  fhirAllergy();
    	Object updatedJson = JsonPath.parse(json).json();
        List category = JsonPath.read(updatedJson, "$.entry[*].resource.category");
        List clinicalStatus = JsonPath.read(updatedJson, "$.entry[*].resource.clinicalStatus.coding[0].code");
        String jsonToParse = updatedJson.toString();
        //json = JsonPath.parse(jsonToParse).set("$.entry[1].resource.category", "food");
        List ncategory = JsonPath.read(json, "$.entry[*].resource.category");
        System.out.println(category);
        System.out.println(clinicalStatus);
        System.out.println(ncategory);
    }
    
    public static String fhirAllergy() {
    	String allergy = "{\n" + 
    			"    \"resourceType\": \"Bundle\",\n" + 
    			"    \"id\": \"63dbeb84-7f3b-442b-9380-309a98e9c76e\",\n" + 
    			"    \"type\": \"searchset\",\n" + 
    			"    \"total\": 45,\n" + 
    			"    \"link\": [\n" + 
    			"        {\n" + 
    			"            \"relation\": \"self\",\n" + 
    			"            \"url\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance?patient=5938008\"\n" + 
    			"        }\n" + 
    			"    ],\n" + 
    			"    \"entry\": [\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8359733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8359733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8359733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T09:36:47Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Naturally occurring alkaloid (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: RESPIRATORY DISTRESS - 2020-01-20T09:36:48Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"74782004\",\n" + 
    			"                            \"display\": \"Naturally occurring alkaloid (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Naturally occurring alkaloid\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T09:36:47Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8359735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T09:36:48Z\",\n" + 
    			"                        \"text\": \"RESPIRATORY DISTRESS\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8383733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8383733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8383733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-21T16:36:12Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Dextranase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-21T16:36:13Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"785009\",\n" + 
    			"                            \"display\": \"Dextranase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Dextranase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-21T16:36:12Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8383735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-21T16:36:13Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8363733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8363733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8363733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T12:03:53Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Penicillin -class of antibiotic- (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Medication</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T12:03:54Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"6369005\",\n" + 
    			"                            \"display\": \"Penicillin -class of antibiotic- (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Penicillin -class of antibiotic-\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T12:03:53Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8363735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T12:03:54Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299759\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299759\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299759\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:36:15Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Elastin (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"1471007\",\n" + 
    			"                            \"display\": \"Elastin (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Elastin\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:36:15Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8295733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8295733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8295733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T17:09:03Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Ornithine racemase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"120006\",\n" + 
    			"                            \"display\": \"Ornithine racemase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Ornithine racemase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T17:09:03Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367745\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367745\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367745\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:25:59Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Immunoglobulin, aggregated (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Test symptom - 2020-01-20T13:25:59Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"860009\",\n" + 
    			"                            \"display\": \"Immunoglobulin, aggregated (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Immunoglobulin, aggregated\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:25:59Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367747\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:25:59Z\",\n" + 
    			"                        \"text\": \"Test symptom\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299735\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299735\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299735\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:21:56Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Acylcarnitine hydrolase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"371001\",\n" + 
    			"                            \"display\": \"Acylcarnitine hydrolase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Acylcarnitine hydrolase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:21:56Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299739\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299739\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299739\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:23:47Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Fibrinogen San Juan (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"363000\",\n" + 
    			"                            \"display\": \"Fibrinogen San Juan (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Fibrinogen San Juan\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:23:47Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8331733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8331733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8331733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-16T15:04:36Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Pipenzolate (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: Low Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Itching and watery eyes - 2020-01-16T15:04:36Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"low\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"74798006\",\n" + 
    			"                            \"display\": \"Pipenzolate (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Pipenzolate\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-16T15:04:36Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8331735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-16T15:04:36Z\",\n" + 
    			"                        \"text\": \"Itching and watery eyes\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8135733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8135733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8135733\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-18T16:47:25Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Allergy to eggs (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"91930004\",\n" + 
    			"                            \"display\": \"Allergy to eggs (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Egg allergy\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-18T16:47:25Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/7863755\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"7863755\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"7863755\",\n" + 
    			"                    \"lastUpdated\": \"2019-05-10T16:39:30Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Acetaminophen</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p><p><b>Reactions</b>: Hives, Difficulty breathing</p><p><b>Onset</b>: Feb  1, 2019 10:18 A.M. CST</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\n" + 
    			"                            \"code\": \"161\",\n" + 
    			"                            \"display\": \"Acetaminophen\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Tylenol\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"onsetDateTime\": \"2019-02-01T16:18:00Z\",\n" + 
    			"                \"recordedDate\": \"2019-05-10T16:39:30Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/5268007\",\n" + 
    			"                    \"display\": \"Kaehr, Andrew\"\n" + 
    			"                },\n" + 
    			"                \"reaction\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"7863757\",\n" + 
    			"                        \"manifestation\": [\n" + 
    			"                            {\n" + 
    			"                                \"coding\": [\n" + 
    			"                                    {\n" + 
    			"                                        \"system\": \"http://snomed.info/sct\",\n" + 
    			"                                        \"code\": \"247472004\",\n" + 
    			"                                        \"display\": \"Weal (disorder)\"\n" + 
    			"                                    }\n" + 
    			"                                ],\n" + 
    			"                                \"text\": \"Hives\"\n" + 
    			"                            }\n" + 
    			"                        ]\n" + 
    			"                    },\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"7863759\",\n" + 
    			"                        \"manifestation\": [\n" + 
    			"                            {\n" + 
    			"                                \"coding\": [\n" + 
    			"                                    {\n" + 
    			"                                        \"system\": \"http://snomed.info/sct\",\n" + 
    			"                                        \"code\": \"230145002\",\n" + 
    			"                                        \"display\": \"Difficulty breathing (finding)\"\n" + 
    			"                                    }\n" + 
    			"                                ],\n" + 
    			"                                \"text\": \"Difficulty breathing\"\n" + 
    			"                            }\n" + 
    			"                        ]\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8307733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8307733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8307733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-12T09:59:08Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Mixed dust (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"7271004\",\n" + 
    			"                            \"display\": \"Mixed dust (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Mixed dust\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T09:59:08Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367739\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367739\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367739\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:24:02Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Urethan (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T13:24:03Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"873008\",\n" + 
    			"                            \"display\": \"Urethan (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Urethan\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:24:02Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367741\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:24:03Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8339739\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8339739\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8339739\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-16T18:08:11Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Amoxicillin</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p><p><b>Onset</b>: Jan 11, 2020  5:00 A.M. UTC</p><p><b>Note</b>: Updated with additional details provided by patient. - 2020-01-16T18:08:11Z - Howdeshell, Tami</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\n" + 
    			"                            \"code\": \"723\",\n" + 
    			"                            \"display\": \"Amoxicillin\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"amoxicillin\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"onsetDateTime\": \"2020-01-11T05:00:00Z\",\n" + 
    			"                \"recordedDate\": \"2020-01-16T18:08:11Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8339741\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/2578010\",\n" + 
    			"                            \"display\": \"Howdeshell, Tami\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-16T18:08:11Z\",\n" + 
    			"                        \"text\": \"Updated with additional details provided by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8135737\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8135737\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8135737\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-18T17:33:29Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Fentanyl</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\n" + 
    			"                            \"code\": \"4337\",\n" + 
    			"                            \"display\": \"Fentanyl\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"FentaNYL Citrate\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-18T17:33:29Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8387737\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8387737\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8387737\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-21T17:30:39Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Coal tar extract (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: RESPIRATORY DISTRESS - 2020-01-21T17:30:40Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"699003\",\n" + 
    			"                            \"display\": \"Coal tar extract (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Coal tar extract\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-21T17:30:39Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8387739\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-21T17:30:40Z\",\n" + 
    			"                        \"text\": \"RESPIRATORY DISTRESS\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8311743\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8311743\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8311743\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-12T18:37:10Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Plant phenol oil (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Food</p><p><b>Note</b>: Allergy reported by patient. - 2020-01-12T18:37:10Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"9220005\",\n" + 
    			"                            \"display\": \"Plant phenol oil (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Plant phenol oil\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T18:37:10Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8311745\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-12T18:37:10Z\",\n" + 
    			"                        \"text\": \"Allergy reported by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8375733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8375733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8375733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T17:40:51Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Lytic antibody (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Rash - 2020-01-20T17:40:51Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"819002\",\n" + 
    			"                            \"display\": \"Lytic antibody (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Lytic antibody\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T17:40:51Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8375735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T17:40:51Z\",\n" + 
    			"                        \"text\": \"Rash\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8311733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8311733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8311733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-12T18:33:12Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Nitrogen fluoride (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Food</p><p><b>Note</b>: Allergy reported by patient. - 2020-01-12T18:33:12Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"1535009\",\n" + 
    			"                            \"display\": \"Nitrogen fluoride (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Nitrogen fluoride\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T18:33:12Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8311735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-12T18:33:12Z\",\n" + 
    			"                        \"text\": \"Allergy reported by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8131745\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8131745\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8131745\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-11T21:45:35Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Diphenhydramine allergy (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"294133003\",\n" + 
    			"                            \"display\": \"Diphenhydramine allergy (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Diphenhydramine allergy\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-11T21:45:35Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8271733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8271733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8271733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-07T16:52:42Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Sparteine (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"377002\",\n" + 
    			"                            \"display\": \"Sparteine (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Sparteine\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-07T16:52:42Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/7863749\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"7863749\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"7863749\",\n" + 
    			"                    \"lastUpdated\": \"2019-05-10T16:38:03Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Egg (yolk and white) specific IgE antibody measurement (procedure)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Food</p><p><b>Reactions</b>: Swelling of throat</p><p><b>Onset</b>: Jan  1, 2019 10:18 A.M. CST</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"contained\": [\n" + 
    			"                    {\n" + 
    			"                        \"resourceType\": \"PractitionerRole\",\n" + 
    			"                        \"id\": \"638994\",\n" + 
    			"                        \"code\": [\n" + 
    			"                            {\n" + 
    			"                                \"coding\": [\n" + 
    			"                                    {\n" + 
    			"                                        \"system\": \"http://terminology.hl7.org/CodeSystem/practitioner-role\",\n" + 
    			"                                        \"code\": \"doctor\",\n" + 
    			"                                        \"display\": \"Doctor\"\n" + 
    			"                                    }\n" + 
    			"                                ],\n" + 
    			"                                \"text\": \"Doctor\"\n" + 
    			"                            }\n" + 
    			"                        ]\n" + 
    			"                    }\n" + 
    			"                ],\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"388630007\",\n" + 
    			"                            \"display\": \"Egg (yolk and white) specific IgE antibody measurement (procedure)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Egg (yolk and white) RAST\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"onsetDateTime\": \"2019-01-01T16:18:00Z\",\n" + 
    			"                \"recordedDate\": \"2019-05-10T16:38:03Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/5268007\",\n" + 
    			"                    \"display\": \"Kaehr, Andrew\"\n" + 
    			"                },\n" + 
    			"                \"asserter\": {\n" + 
    			"                    \"reference\": \"#638994\"\n" + 
    			"                },\n" + 
    			"                \"reaction\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"7863751\",\n" + 
    			"                        \"manifestation\": [\n" + 
    			"                            {\n" + 
    			"                                \"coding\": [\n" + 
    			"                                    {\n" + 
    			"                                        \"system\": \"http://snomed.info/sct\",\n" + 
    			"                                        \"code\": \"2129002\",\n" + 
    			"                                        \"display\": \"Edema of pharynx (disorder)\"\n" + 
    			"                                    }\n" + 
    			"                                ],\n" + 
    			"                                \"text\": \"Swelling of throat\"\n" + 
    			"                            }\n" + 
    			"                        ]\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:22:39Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Blood group antigen D (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T13:22:39Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"876000\",\n" + 
    			"                            \"display\": \"Blood group antigen D (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Blood group antigen D\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:22:39Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:22:39Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367763\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367763\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367763\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:36:38Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Phenoxybenzamine (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Test - 2020-01-20T13:36:38Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"74771007\",\n" + 
    			"                            \"display\": \"Phenoxybenzamine (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Phenoxybenzamine\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:36:38Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367765\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:36:38Z\",\n" + 
    			"                        \"text\": \"Test\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299751\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299751\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299751\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:30:23Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Actinium (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"1396009\",\n" + 
    			"                            \"display\": \"Actinium (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Actinium\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:30:23Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8131741\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8131741\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8131741\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-11T21:44:59Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Glucagon allergy (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: Low Risk</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"low\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"294671005\",\n" + 
    			"                            \"display\": \"Glucagon allergy (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Glucagon allergy\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-11T21:44:59Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367751\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367751\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367751\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:28:30Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Peptide-N^4^-(N-acetyl-b-glucosaminyl) asparagine amidase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Test symptom - 2020-01-20T13:28:30Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"859004\",\n" + 
    			"                            \"display\": \"Peptide-N^4^-(N-acetyl-b-glucosaminyl) asparagine amidase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Peptide-N^4^-(N-acetyl-b-glucosaminyl) asparagine amidase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:28:30Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367753\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:28:30Z\",\n" + 
    			"                        \"text\": \"Test symptom\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8259745\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8259745\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8259745\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-05T07:37:29Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Ice (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Category</b>: Food</p><p><b>Note</b>: Updated with additional details provided by patient. - 2020-01-05T07:37:30Z - Portal, Portal</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"896008\",\n" + 
    			"                            \"display\": \"Ice (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Ice\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-05T07:37:29Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8259747\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/4464007\",\n" + 
    			"                            \"display\": \"Portal, Portal\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-05T07:37:30Z\",\n" + 
    			"                        \"text\": \"Updated with additional details provided by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299747\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299747\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299747\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:28:17Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Free protein S (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"519005\",\n" + 
    			"                            \"display\": \"Free protein S (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Free protein S\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:28:17Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8259751\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8259751\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8259751\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-05T07:40:12Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Mephenoxalone (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"1190007\",\n" + 
    			"                            \"display\": \"Mephenoxalone (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Mephenoxalone\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-05T07:40:12Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8371733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8371733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8371733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T16:28:00Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Erythromycin lactobionate (substance)</p><p><b>Verification Status</b>: Unconfirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T16:28:02Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"unconfirmed\",\n" + 
    			"                            \"display\": \"Unconfirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"698006\",\n" + 
    			"                            \"display\": \"Erythromycin lactobionate (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Erythromycin lactobionate\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T16:28:00Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8371735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T16:28:02Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8311751\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8311751\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8311751\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-12T20:15:49Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Primary lactose intolerance (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: Low Risk</p><p><b>Category</b>: Food</p><p><b>Note</b>: Test Symptom - 2020-01-12T20:15:49Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"low\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"190751001\",\n" + 
    			"                            \"display\": \"Primary lactose intolerance (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Primary lactose intolerance\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T20:15:49Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8311753\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-12T20:15:49Z\",\n" + 
    			"                        \"text\": \"Test Symptom\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8131737\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8131737\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8131737\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-11T21:44:34Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Fentanyl allergy (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"293605005\",\n" + 
    			"                            \"display\": \"Fentanyl allergy (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Fentanyl allergy\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-11T21:44:34Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8259733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8259733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8259733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-05T07:23:03Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Acrosin (substance)</p><p><b>Verification Status</b>: Unconfirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p><p><b>Note</b>: Updated with additional details provided by patient. - 2020-01-05T07:23:03Z - Portal, Portal</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"unconfirmed\",\n" + 
    			"                            \"display\": \"Unconfirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"566009\",\n" + 
    			"                            \"display\": \"Acrosin (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Acrosin\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-05T07:23:03Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8259735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/4464007\",\n" + 
    			"                            \"display\": \"Portal, Portal\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-05T07:23:03Z\",\n" + 
    			"                        \"text\": \"Updated with additional details provided by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8131749\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8131749\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8131749\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-11T21:46:18Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Calcium chloride (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"387377009\",\n" + 
    			"                            \"display\": \"Calcium chloride (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Calcium chloride\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-11T21:46:18Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8259739\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8259739\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8259739\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-05T07:33:12Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Trichlorophenol (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p><p><b>Note</b>: Updated with additional details provided by patient. - 2020-01-05T07:33:12Z - Portal, Portal</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"620005\",\n" + 
    			"                            \"display\": \"Trichlorophenol (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Trichlorophenol\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-05T07:33:12Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8259741\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/4464007\",\n" + 
    			"                            \"display\": \"Portal, Portal\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-05T07:33:12Z\",\n" + 
    			"                        \"text\": \"Updated with additional details provided by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367757\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367757\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367757\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:31:32Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Stizolobate synthase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Test symptom - 2020-01-20T13:31:32Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"850000\",\n" + 
    			"                            \"display\": \"Stizolobate synthase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Stizolobate synthase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:31:32Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367759\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:31:32Z\",\n" + 
    			"                        \"text\": \"Test symptom\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8359739\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8359739\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8359739\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T10:08:17Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Acetohydroxamic acid (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T10:08:17Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"74819009\",\n" + 
    			"                            \"display\": \"Acetohydroxamic acid (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Acetohydroxamic acid\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T10:08:17Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8359741\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T10:08:17Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8311757\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8311757\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8311757\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-12T20:21:31Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Polyester (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: Unable to Assess Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: Test Symptom - 2020-01-12T20:21:31Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"unable-to-assess\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"8204009\",\n" + 
    			"                            \"display\": \"Polyester (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Polyester\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T20:21:31Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8311759\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-12T20:21:31Z\",\n" + 
    			"                        \"text\": \"Test Symptom\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299743\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299743\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299743\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:25:26Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Coumachlor (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"296000\",\n" + 
    			"                            \"display\": \"Coumachlor (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Coumachlor\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:25:26Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8299755\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8299755\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8299755\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-10T18:33:34Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Methylparafynol (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"1450002\",\n" + 
    			"                            \"display\": \"Methylparafynol (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Meparfynol\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-10T18:33:34Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8131733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8131733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8131733\",\n" + 
    			"                    \"lastUpdated\": \"2019-10-11T21:43:10Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Midazolam allergy (disorder)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Medication</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Active\"\n" + 
    			"                },\n" + 
    			"                \"type\": \"allergy\",\n" + 
    			"                \"category\": [\n" + 
    			"                    \"medication\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"293901004\",\n" + 
    			"                            \"display\": \"Midazolam allergy (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Midazolam allergy\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"encounter\": {\n" + 
    			"                    \"reference\": \"Encounter/4649909\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2019-10-11T21:43:10Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4474007\",\n" + 
    			"                    \"display\": \"Pickering, Kathy\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8367775\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8367775\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8367775\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-20T13:39:44Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Anthraquinone laxative (product)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Criticality</b>: High Risk</p><p><b>Category</b>: Environment</p><p><b>Note</b>: ITCHING,WATERING EYES - 2020-01-20T13:39:45Z - Thomas, Larry K</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"criticality\": \"high\",\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"74780007\",\n" + 
    			"                            \"display\": \"Anthraquinone laxative (product)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Anthraquinone laxative\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-20T13:39:44Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8367777\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/605925\",\n" + 
    			"                            \"display\": \"Thomas, Larry K\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-20T13:39:45Z\",\n" + 
    			"                        \"text\": \"ITCHING,WATERING EYES\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8307737\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8307737\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8423733\",\n" + 
    			"                    \"lastUpdated\": \"2020-02-03T17:54:15Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: 3-Hydroxyisobutyrate dehydrogenase (substance)</p><p><b>Verification Status</b>: Confirmed</p><p><b>Clinical Status</b>: Resolved</p><p><b>Category</b>: Environment</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"resolved\",\n" + 
    			"                            \"display\": \"Resolved\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"confirmed\",\n" + 
    			"                            \"display\": \"Confirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Resolved\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"environment\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"231008\",\n" + 
    			"                            \"display\": \"3-Hydroxyisobutyrate dehydrogenase (substance)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"3-Hydroxyisobutyrate dehydrogenase\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-12T10:39:03Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                }\n" + 
    			"            }\n" + 
    			"        },\n" + 
    			"        {\n" + 
    			"            \"fullUrl\": \"https://fhir-open.sandboxcerner.com/r4/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca/AllergyIntolerance/8251733\",\n" + 
    			"            \"resource\": {\n" + 
    			"                \"resourceType\": \"AllergyIntolerance\",\n" + 
    			"                \"id\": \"8251733\",\n" + 
    			"                \"meta\": {\n" + 
    			"                    \"versionId\": \"8251733\",\n" + 
    			"                    \"lastUpdated\": \"2020-01-03T09:54:42Z\"\n" + 
    			"                },\n" + 
    			"                \"text\": {\n" + 
    			"                    \"status\": \"generated\",\n" + 
    			"                    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Allergy Intolerance</b></p><p><b>Patient</b>: Nin, Isaac</p><p><b>Allergy</b>: Allergy to peanuts (disorder)</p><p><b>Verification Status</b>: Unconfirmed</p><p><b>Clinical Status</b>: Active</p><p><b>Category</b>: Food</p><p><b>Note</b>: Updated with additional details provided by patient. - 2020-01-03T09:54:44Z - Portal, Portal</p></div>\"\n" + 
    			"                },\n" + 
    			"                \"clinicalStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\n" + 
    			"                            \"code\": \"active\",\n" + 
    			"                            \"display\": \"Active\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"verificationStatus\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",\n" + 
    			"                            \"code\": \"unconfirmed\",\n" + 
    			"                            \"display\": \"Unconfirmed\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Proposed\"\n" + 
    			"                },\n" + 
    			"                \"category\": [\n" + 
    			"                    \"food\"\n" + 
    			"                ],\n" + 
    			"                \"code\": {\n" + 
    			"                    \"coding\": [\n" + 
    			"                        {\n" + 
    			"                            \"system\": \"http://snomed.info/sct\",\n" + 
    			"                            \"code\": \"91935009\",\n" + 
    			"                            \"display\": \"Allergy to peanuts (disorder)\"\n" + 
    			"                        }\n" + 
    			"                    ],\n" + 
    			"                    \"text\": \"Allergy to peanuts\"\n" + 
    			"                },\n" + 
    			"                \"patient\": {\n" + 
    			"                    \"reference\": \"Patient/5938008\",\n" + 
    			"                    \"display\": \"Nin, Isaac\"\n" + 
    			"                },\n" + 
    			"                \"recordedDate\": \"2020-01-03T09:54:42Z\",\n" + 
    			"                \"recorder\": {\n" + 
    			"                    \"reference\": \"Practitioner/4464007\",\n" + 
    			"                    \"display\": \"Portal, Portal\"\n" + 
    			"                },\n" + 
    			"                \"note\": [\n" + 
    			"                    {\n" + 
    			"                        \"id\": \"8251735\",\n" + 
    			"                        \"authorReference\": {\n" + 
    			"                            \"reference\": \"Practitioner/4464007\",\n" + 
    			"                            \"display\": \"Portal, Portal\"\n" + 
    			"                        },\n" + 
    			"                        \"time\": \"2020-01-03T09:54:44Z\",\n" + 
    			"                        \"text\": \"Updated with additional details provided by patient.\"\n" + 
    			"                    }\n" + 
    			"                ]\n" + 
    			"            }\n" + 
    			"        }\n" + 
    			"    ]\n" + 
    			"}";
		return allergy;
    	
    }
}
