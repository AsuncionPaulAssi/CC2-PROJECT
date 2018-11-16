import java.util.*;

public class CollegeDept {
    public static void main(String[] args){
        System.out.println("What college department are you in?");
        Scanner eut = new Scanner(System.in);
        String a = eut.nextLine();
            if (a.equals("CAS")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BAE":
                    System.out.println("Your from the College of Arts and Sciences and your program is " +b);
                    System.out.println("The Bachelor of Arts in English offers a complete three-year curriculum in the trimester school calendar system. The subjects offered in the course hone the four macro-communication skills, thus, developing the abilities of students to speak and write with clarity, and to listen and read with comprehension. At the same time, these subjects develop the skills in critical and creative thinking, literary analyses, intrapersonal and public communications.");
                    break;
                case "BAPS":
                    System.out.println("Your from the College of Arts and Sciences and your program is " +b);
                    System.out.println("Bachelor of Arts in Political Science, a three-year degree program in the trimester school calendar system, is a preparatory course to Bachelor of Laws. It is designed to equip students with basic knowledge to become researchers and/or employees in government and non-government offices as well as in public and private political agencies.");
                    break;
                case "BAC":
                    System.out.println("Your from the College of Arts and Sciences and your program is " +b);
                    System.out.println("Mass Communication, a three-year degree program in the trimester calendar system, is designed for students who are interested to be trained in print media and electronic media - inspire young men and women to seek socially useful and rewarding careers in a field whose importance is second to none.");
                    break;
                case "BSP":
                    System.out.println("Your from the College of Arts and Sciences and your program is " +b);
                    System.out.println("The Bachelor of Science in Psychology is a three-year degree program in the trimester school calendar system. The program examines the science behind individual and collective behavior. It features both active and collaborative experiences in addition to intensive internship experiences, and is most appropriate for students who wish to develop a set of applied scientific and human relations skills that will prepare them for entry-level employment in a wide range of government and private human service organizations and agencies, and in business and industry.");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
    }
            if (a.equals("COA")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSA":
                    System.out.println("Your from the College College of Accountancy  and your program is " +b);
                    System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHED MEMORANDUM ORDER NO. 3 Series of 2007, which is based on International Education Standards aimed to equip students to meet the competencies required in the workplace whether in the country or abroad. It is an 11 trimester course (3 years plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students to be liberally educated accountants who can think and write clearly, effectively, and critically. It also prepares them to become total business advisors, who are knowledgeable with business structures and economic concepts; and trains them to be ethically and technically competent in the field of accounting and auditing.");
                    break;
                case "BSAT":
                    System.out.println("Your from the College College of Accountancy  and your program is " +b);
                    System.out.println("The BSAcT is a program that prepares students for a career in the accounting and finance divisions of organizations in the private and public sectors. The accounting courses in the BSAcT program, combined with business management courses, equip students with the needed skills, proficiency, and intellectual abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and industry, government, and education, need support staff who will work as bookkeepers, financial analysts, audit staff, inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.");
                    break;
                case "BSMA":
                    System.out.println("Your from the College College of Accountancy  and your program is " +b);
                    System.out.println("The BSMA curriculum is a 9 trimester course (3 years), equivalent to a 4-year course in a semestral setting. The course prepares students for a career within the accounting and finance division of both private enterprises and public sectors. The courses offered are a combination of accounting and related business subjects to equip them with the needed skills, proficiency and intellectual abilities. All the four (4) major fields of Accountancy, namely, public practice, commerce and industry, government, and education, need support staff to work as bookkeepers, financial analysts, audit staff, inventory control personnel, accounts payable administration personnel and other accounting works where a CPA title is not required. The BSMA graduate could adequately respond to this need.");
                    break;
                case "BSFA":
                    System.out.println("Your from the College College of Accountancy  and your program is " +b);
                    System.out.println("BS in Forensic Accounting is a degree program that prepares a person to become a professional forensic accountant or fraud examiner. The program has a total of 201 units and can be finished within nine terms or three years. Forensic Accounting or financial forensics is the specialty practice area of accountancy that encompasses engagements that deters and/or detects fraud and may result from actual or anticipated disputes or litigation. The integration of accounting, auditing and investigative skills yields the specialization known as Forensic Accounting. It provides an accounting analysis that is suitable to the court which will form the basis for discussion, debate and ultimately dispute resolution.");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            }
            if (a.equals("CEA")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSA":
                    System.out.println("Your from the College of Engineering Architecture and your program is " +b);
                    System.out.println("Architecture prepares the students for a forerunning practice of the different aspects of the profession. Students are provided with hands-on approach of training in planning, design and implementation of the aesthetic and functional requirements of living and monumental spaces for an individual, a community or an industry. Founded on the theory and practice of designing, with an introduction to computer-aided designing and drafting, a graduate will be prepared for such various field of architecture such as interior design, physical planning, landscaping, urban planning and building construction.");
                    break;
                case "BSCE":
                    System.out.println("Your from the College of Engineering Architecture and your program is " +b);
                    System.out.println("The civil engineering program is designed to produce professionals who can harness the forces of nature and the earth's natural resources to provide facilities of living, industry and transportation. With mathematical and physical science as foundation, the students will be trained both theoretical and practical aspects of surveying, hydraulics, geotechnical engineering, construction management, structural engineering and transportation engineering.");
                    break;
                case "BS Comp Eng":
                    System.out.println("Your from the College of Engineering Architecture and your program is " +b);
                    System.out.println("In the fast changing world of computers, the Computer Engineering program provides students with the fundamentals of the theory and design of computer software, system, and hardware. Students shall be trained with hands-on applications of the latest trends in software engineering, microchip technology, automation, and mechatronics, thus, graduating with adequate knowledge and skills for a demanding industry in computer technology.");
                    break;
                case "BSEE":
                    System.out.println("Your from the College of Engineering Architecture and your program is " +b);
                    System.out.println("The program of Electronics Engineering aims to produce competitive professionals in the world of electronics, communications and its various areas of applications. The science program is deeply rooted in mathematics with full training in theories and design of electronic circuits, communication and microprocessor system. Graduates will be expected to apply theories in practical applications using the latest tools including computer interfaces for its graduates to be ready and up-to-date in the modern demand of the industry.");
                    break;
                case "BSE&SA":
                    System.out.println("Your from the College of Engineering Architecture and your program is " +b);
                    System.out.println("The program of Environmental and Sanitary Engineering has been recognized by the Commision of Higher Education (CHED) as \"Center of Development for Excellence\" for its efficient instruction and potential for research in the field of Sanitary Engineering. Its program is geared towards developing students with adequate knowledge of modern technology and environmental concerns in this timely and much needed field of study. Graduates are expected to be experts in natural sciences, sanitary equipments, system and infrastructures, chemical analyses, and environmental and ecological management.");
                default:
                    System.out.println("ERROR");
                    break;
            }
            }
             if (a.equals("CITCS")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSCS":
                    System.out.println("Your from the College of Information Technology and Computer Science and your programn is " +b);
                    System.out.println("The Bachelor of Science in Computer Science program provides the students with an in-depth understanding on the theoretical and applied aspects of computing. Students gain knowledge of the theories along with the methodologies and techniques in the research and development of multifaceted software systems as well as new knowledge in the field of computing.");
                    break;
                case "BSIT":
                    System.out.println("Your from the College of Information Technology and Computer Science and your programn is " +b);
                    System.out.println("The Bachelor of Science in Information Technology (BSIT) is comprised of two tracks: Network Security and Web Technology. The program focuses on the roles of IT professionals ranging from installing applications to designing computer networks and databases to meet the needs of the industry and government. The development, management, and maintenance of IT systems are key competitive factors that are essential to business success in today's world.");
                    break;
                case "BSIS":
                    System.out.println("Your from the College of Information Technology and Computer Science and your programn is " +b);
                    System.out.println("");
                    break;
                case "BSDA":
                    System.out.println("Your from the College of Information Technology and Computer Science and your programn is " +b);
                    System.out.println("The curriculum Bachelor of Science in Data Analytics (BSDA) program is designed to respond to the needs of the students for critical skills and knowledge required to direct and to control computerized information resources within diverse organizational settings. The study of Information Systems provides professionals with the expertise and knowledge to support innovation, planning, and management of information infrastructures as well as the coordination of information resources.");
                    break;
                case "ACT":
                    System.out.println("Your from the College of Information Technology and Computer Science and your programn is " +b);
                    System.out.println("The Associate in Computer Technology program provides the students with the skills and understanding to manage, improve and take care of computer systems and computer applications. Students will be prepared to work with advanced computer and communications equipments, computer applications and as support for offices and IT organizations.");
                default:
                    System.out.println("ERROR");
                    break;
            }
            }
             if (a.equals("CTE")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSEEd":
                    System.out.println("Your from the College Teacher Education and your program is " +b);
                    System.out.println("The BEEd program aims to produce competent and effective teachers in the elementary school. The program integrates theory and practice in order to provide students not only with the necessary pedagogical skills but also with adequate and updated knowledge in the various disciplines. Students under this program are trained to develop the right attitude towards teaching as well as the basic skills necessary to conduct research.");
                    break;
                case "BSEE":
                    System.out.println("Your from the College Teacher Education and your program is " +b);
                    System.out.println("The BEEd program aims to produce competent and effective teachers in the elementary school. The program integrates theory and practice in order to provide students not only with the necessary pedagogical skills but also with adequate and updated knowledge in the various disciplines. Students under this program are trained to develop the right attitude towards teaching as well as the basic skills necessary to conduct research. The BEEd curriculum offers specialization in Special Education (SPED) and in Preschool Education.");
                    break;
                case "BSSE":
                    System.out.println("Your from the College Teacher Education and your program is " +b);
                    System.out.println("The BSEd program aims to produce competent and effective teachers in the secondary level. The program also integrates theory and practice in order to provide the students not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field of specialization. Students under this program are trained to develop the right attitude towards teaching. The program also provides students with the knowledge and basic skills necessary to conduct research work.");
                default:    
                    System.out.println("ERROR");
                    break;
            }
            }
             if (a.equals("CCJE")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSC":
                    System.out.println("Your from the College Criminal Justice Education and your program is " +b);
                    System.out.println("");
                    break;
                case "BSFS":
                    System.out.println("Your from the College of Criminal Justice Education and your program is " +b);
                    System.out.println("");
                default: 
                    System.out.println("ERROR");
                    break;
            }
            }
            if (a.equals("CBA")){
                System.out.println("What College Program Are You Taking? ");
        String b = eut.nextLine();
            switch (b) {
                case "BSBA":
                    System.out.println("Your from the College Business Administration and your program is " +b);
                case "BSE":
                    System.out.println("Your from the College Business Administration and your program is " +b);
                case "BSOA":
                    System.out.println("Your from the College Business Administration and your program is " +b);
                default:
                    System.out.println("ERROR");
                    break;  
            }
            }
                
    }
}