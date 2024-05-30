package com.taizo.model;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "can_lead")
@Getter
@Setter
@ToString
public class CanLeadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "mobile_number")
    private long mobileNumber;
    
    @Column(name="country_code")
    private String countryCode;
    
    @Column(name="expected_salary")
    private String expectedSalary;
    
    @Column(name="expected_salary_is")
    private String expectedSalaryIs;
    
    @Column(name = "is_ready_for_shifts")
    private boolean isReadyForShifts;
    
    @Column(name = "is_not_attend")
    private boolean isNotAttend;
    
    @Column(name ="no_of_not_attend")
    private int noOfNotAttend;
    
    @Column(name="candidate_id")
    private int candidateId;
    
    @Column(name="is_candidate")
    private boolean isCandidate;
    
    @Column(name="not_attend_moved_on")
    private Timestamp notAttendMovedOn;
    
    @Column(name = "is_need_accommodation")
    private boolean isNeedAccommodation;
    
    @Column(name="follow_up_date1")
    private Timestamp followUpDate1;
    
    @Column(name="follow_up_date2")
    private Timestamp followUpDate2;
    
    @Column(name="tentative_interview_date")
    private Timestamp tentativeInterviewDate;

    @Column(name = "from_naukri")
    private boolean fromNaukri;
    
    @Column(name = "is_having_updated_cv")
    private boolean HavingUpdatedCv;
    
    @Column(name = "company_name")
    private String companyName;
    
    @Column(name = "company_location")
    private String companyLocation;
    
    @Column(name = "job_type_mode")
    private String jobTypeMode;
    
    @Column(name = "job_work_hours")
    private String jobWorkHours;
    
    @Column(name = "notice_period")
    private String noticePeriod;
    
    @Column(name = "take_home_salary")
    private String takeHomeSalary;
    
    @Column(name = "salary_proof_document_type")
    private String salaryProofDocumentType;
    
    @Column(name = "relation_name")
    private String relationName;
    
    @Column(name = "emergency_contact_number ")
    private String emergencyContactNumber ;
    
    @Column(name = "mobile_num_verified")
    private boolean mnverified;

    @Column(name = "name")
    private String name;
    
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "assign_to")
    private Integer assignTo;
    
    @Column(name = "admin_id")
    private Integer adminId;
    
    @Column(name = "assigning_time")
    private Timestamp assigningTime;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;
    
    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name="profile_pic")
    private String profilePic;
    
    @Column(name = "qualification")
    private String qualification;

    @Column(name = "specialization")
    private String specification;
    
    @Column(name = "exp_in_manufacturing")
    private boolean expInManufacturing;
    
    @Column(name = "experienced")
    private boolean experienced;
    
    @Column(name = "candidate_type")
    private String candidateType;

    @Column(name = "industry")
    private String industry;
    
    @Column(name = "job_category")
    private String jobCategory;
    
    @Column(name = "key_Skill")
    private String keySkill;

    @Column(name = "exp_in_years")
    private int expYears;

    @Column(name = "exp_in_months")
    private int expMonths;
    
    @Column(name = "job_location")
    private String jobLocation;
    
    @Column(name = "known_languages")
    private String knownLanguages;
    
    @Column(name = "certification_courses")
    private String courses;

    @Column(name = "wa_campaign")
    private boolean WACampaign;
    
    @Column(name = "stop_wa_campaign")
    private boolean stopWACampaign;

    @Column(name = "language_key")
    private String languageKey;

    @Column(name = "fcm_token")
    private String fcmToken;
    
    @Column(name = "profile_page_no")
    private int profilePageNo;
    
    @Column(name = "looking_for_a_job")
    private boolean lookingForaJob;
    
    @Column(name = "from_app")
    private boolean fromApp;
    
    @Column(name = "from_retention")
    private boolean fromRetention;
    
    @Column(name = "from_wa")
    private boolean fromWA;
    
    @Column(name = "from_admin")
    private boolean fromAdmin;
   
    @CreationTimestamp
    @ColumnDefault("created_time")
    protected Date createdTime;
    
    @Column(name = "passed_out_year")
    private int passed_out_year;

    @Column(name = "passed_out_month")
    private int passed_out_month;
    
    @Column(name = "student")
    private String student;
    
    
    @Column(name = "currently_working")
    private String currentlyworking;
    
    @Column(name = "immediate_joiner")
    private boolean immediateJoiner;
    
    @Column(name = "reason_for_unemployment")
    private String reason_for_unemployment;
    
    @Column(name = "reason_for_jobchange")
    private String reason_for_jobchange;
    
    @Column(name = "pref_location")
    private String prefLocation;
    
    @Column(name = "pref_area")
    private String prefArea;
    
    @Column(name = "whatsapp_number")
    private long whatsappNumber;
    
    @Column(name = "pf_esi_account")
    private String pfEsiAccount;
    
    @Column(name = "is_having_arrear")
    private String isHavingArrear;
   
    @Column(name = "reference")
    private String reference;
    
    
    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "qualified")
    private boolean qualified;

    @Column(name = "not_qualified")
    private boolean notQualified;

    @Column(name = "from_fb_meta_lead_ad")
    private boolean fromFbMetaLeadAd;

    @Column(name = "joining_availability")
    private String joiningAvailability;
    
    @Column(name = "is_daily_task")
    private boolean isDailyTask;

    @Column(name = "is_seen")
    private boolean isSeen;
    
    @Column(name = "notes")
    private String notes;

    @Column(name = "entry_on")
    private Date entryOn;

    @Column(name = "job_role")
    private String jobRole;

    @Column(name = "current_pipeline")
    private String currentPipeline;

    @Column(name = "pipeline_stage")
    private String pipelineStage;

    @Column(name = "call_remainder_on")
    private Timestamp callRemainderOn;

    @Column(name = "is_call_remainder")
    private boolean CallRemainder;

    @Column(name = "current_status")
    private String currentStatus;

    @Column(name = "from_source")
    private String fromSource;

    @Column(name = "not_qualified_on")
    private String notQualifiedOn;

    @Column(name = "lead_lost_on")
    private String leadLostOn;

    
    @Transient
    private String status;
    
    @Transient
    private String scheduledBy;
    
    @Transient
    private Date endDate;
    
    @Transient
    private int page;
    
    @Transient
    private int size;
    
    @Transient
    private int maxExperience;

    


    
}
