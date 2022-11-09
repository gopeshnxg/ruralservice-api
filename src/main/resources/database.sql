CREATE TABLE applicant_information (
  applicant_information_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  pmjjy_money INT DEFAULT NULL,
  karya_swaroop INT NOT NULL,
  karya_prakriti1 INT NOT NULL,
  karya_prakriti2 INT NOT NULL,
  karya_prakriti3 INT NOT NULL,
  name varchar(120) NOT NULL,
  name_as_aadhar varchar(120) NOT NULL,
  father_or_husband_name varchar(120) NOT NULL,
  father_or_husband INT NOT NULL,
  mother_name varchar(120) NOT NULL,
  gender INT NOT NULL,
  marriage INT NOT NULL,
  dob date NOT NULL,
  age INT NOT NULL,
  caste INT NOT NULL,
  manrega INT DEFAULT NULL,
  ration_card_number varchar(50) DEFAULT NULL,
  voter_id varchar(50) DEFAULT NULL,
  rsby varchar(50) DEFAULT NULL,
  aadhar_card_number varchar(12) NOT NULL,
  bank_name varchar(50) NOT NULL,
  branch_name varchar(50) NOT NULL,
  ac_number varchar(20) NOT NULL,
  ifs_code varchar(25) NOT NULL,
  esi_number varchar(12) NOT NULL,
  epf_number varchar(12) NOT NULL,
  created_by varchar(120) DEFAULT NULL,
  modified_by varchar(120) DEFAULT NULL,
  created_date timestamp NOT NULL DEFAULT current_timestamp(),
  modified_date timestamp DEFAULT NULL ON Update current_timestamp(),
  status INT NOT NULL
) ;


CREATE TABLE applicant_address (
  address_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  applicant_information_id int NOT NULL,
  district int NOT NULL,
  applicant_address_type int NOT NULL,
  assembly_area int NOT NULL,
  development_block int NOT NULL,
  panchayat int NOT NULL,
  ward int NOT NULL,
  address varchar(200) NOT NULL,
  house_no varchar(50) NOT NULL,
  mobile1 varchar(12) NOT NULL,
  mobile2 varchar(12) DEFAULT NULL,
  address_type varchar(10) NOT NULL,
  created_by varchar(120) DEFAULT NULL,
  modified_by varchar(120) DEFAULT NULL,
  created_date timestamp NOT NULL DEFAULT  current_timestamp(),
  modified_date timestamp NULL DEFAULT NULL ON Update current_timestamp(),
  foreign key (applicant_information_id) references applicant_information(applicant_information_id)
);

CREATE TABLE  APPLICANT_FAMILY_MEMBER (
	member_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  	applicant_information_id int NOT NULL,
	name	varchar(120)		NOT NULL	,
	relation	int	NOT NULL,
	dob	Date		not null,
	age	int not null,
	gender	int	not null,
	aadhar_card_number	varchar(12) not null,
	nominee	int ,
	nominee_percentage	int ,
	education 	int	not null,
	school_grade	int,
	marital_status	int not null,
	program_name	int	,		
	status int default 0,
	  created_by varchar(120) DEFAULT NULL,
  modified_by varchar(120) DEFAULT NULL,
  created_date timestamp NOT NULL DEFAULT  current_timestamp(),
  modified_date timestamp NULL DEFAULT NULL ON Update current_timestamp(),

  	foreign key (applicant_information_id) references applicant_information(applicant_information_id)
);
