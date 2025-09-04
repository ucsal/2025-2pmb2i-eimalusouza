package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Print print;
    public OfficeService(Print device){ this.print = device; }
    public void printReport(String content){
    print.print(content);
    }
}
