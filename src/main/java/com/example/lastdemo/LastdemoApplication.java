package com.example.lastdemo;

import com.example.lastdemo.Service;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
@EnableAspectJAutoProxy
public class LastdemoApplication {

    @Autowired
    Service service;

    public static void main(String[] args) throws IOException, InvalidFormatException, Exception {

                SpringApplication.run(LastdemoApplication.class, args);

        
        
        
        
//        int a = 10;
//        Object b = a;
//
//        String inputTime = "2024-06-01 00:00:00";
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        LocalDateTime localDateTime = LocalDateTime.parse(inputTime, dateTimeFormatter);
//        ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
//        ZonedDateTime istZonedDateTime = localDateTime.atZone(istZoneId);
//        ZonedDateTime utcZonedDateTime = istZonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
//
//        String utcTime = utcZonedDateTime.format(dateTimeFormatter);
//        LocalDateTime localStartTime = LocalDateTime.parse(utcTime, dateTimeFormatter);
//
//        System.out.println(localStartTime);
//
//        Deque<String> stringDeque = new LinkedList<>();
//
//        stringDeque.add("1st added");
//        stringDeque.add("2nd added");
//        stringDeque.add("3rd added");
//        stringDeque.addFirst("first element added through first method");
//        stringDeque.addFirst("second element added through first method");
//        stringDeque.addLast("last added through method");

//        for (String dequqeElement : stringDeque) {
//            System.out.println(dequqeElement);
//
//        }
//
//        List<String> names = new ArrayList<>();
//
//        for (int i = 1; i < 7; i++) {
//            names.add("jeevan" + i);
//        }
//
//        System.out.println(names);
//
//        Iterator<String> namesIterator = names.iterator();
//        while (namesIterator.hasNext()) {
//            System.out.println(namesIterator.next());
//            namesIterator.remove();
//
//        }
//        System.out.println(names.size());
//       ExecutorService service=Executors.newVirtualThreadPerTaskExecutor();
//        
//       
//       service.submit(()->{
//       
//       
//       
//       });
//        String check=null;
//        if(!Objects.nonNull(check)){
//        System.out.println("given string is null");
//        }

//        System.out.println(String.valueOf(b));
//
//        String name = "jeevan";
//        name.getBytes().
//        
//        StringBuilder test=new StringBuilder();
//        test.append("hi from string builder");

//        HashMap<String, String> map = new HashMap<>();
//
//        String testString = "hi from string builder";
//        map.put(testString, testString);
//        if(map.containsKey(test)){
//        System.out.println("value present on given string");
//        }
//        else{
//        System.out.println("value not present in map");
//        }
//        

//ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(1);
//ExecutorService executorService = 
//  MoreExecutors.getExitingExecutorService(executor, 
//    10, TimeUnit.SECONDS);
//
//executorService.submit(()->{
//
//while(true){
//    Thread.sleep(1000);
//
//System.out.println("running thread in executor service");
//}
//
//});
//
//executorService.shutdown();

//    throw new Exception();
//    
//     String privateKeyPath = "src\\main\\resources\\files\\AuthKey_Z9MCP2K452.p8";
//        AppClient client = new AppClient(
//                "com.ace2three.mobile.plus",
//                "DE5J9SP4MR",
//                privateKeyPath,
//                "Z9MCP2K452"
//        );
//
//        String clientSecret = client.generateSecret();
//        System.out.println("Client ID: " + client.getId());
//        System.out.println("Client Secret: " + clientSecret);
//    System.out.println("called exit method"+System.currentTimeMillis());
//System.exit(0);
//        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.BasicAsyncLoggerContextSelector");
//        String name = ManagementFactory.getRuntimeMXBean().getName();
//        System.out.print(name.split("@")[0]);
//        String file_path = "C:\\Users\\volam.kumar\\Desktop\\lastdemo\\src\\main\\resources\\files\\loss_protection_report27SEP2024.xlsx";
//        File file = new File(file_path);
//        FileInputStream fileInputStream = new FileInputStream(file_path);

    //    Workbook workbook = WorkbookFactory.create(fileInputStream);
//        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
//        Sheet hssfSheet = workbook.getSheet("sheet1");
//        float number = 1;
//        float sipAmount = 30000;
//        float totalSum = 0;
//        
//        System.out.println( "the number of rows is "+ hssfSheet.getPhysicalNumberOfRows());
//        for (int i = 0; i < 132; i++) {
//            int j = i;
//            sipAmount = 30000;
          
//            while (j<132&&hssfSheet.getRow(j).getCell(6).getNumericCellValue() != 0) {
//
//               // System.out.println("without cast"+number+hssfSheet.getRow(j).getCell(6).getNumericCellValue());
//                float percentage=(float) (number+hssfSheet.getRow(j).getCell(6).getNumericCellValue());
//                System.out.println("with cast"+percentage);
//                sipAmount *= percentage;
////                System.out.println("the lumpsum is:"+sipAmount);
//                j++;
//            }
//            totalSum += sipAmount;
//the total amount is:8664520.286242435 for nifty 50
//so we can say returns from nifty is 12% cagr as this data is 11 years should remove 
//expense ratio and taxes
//the total amount in nifty small cap 250 for 11 years is 11,752,397. so its 16% returns post eexpense ratio and taxes
//        }

//        System.out.println("the total amount is:" + totalSum);
//    }


}}
