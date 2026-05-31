Scanner sc = new Scanner(System.in);

System.out.println("저장소 선택");
System.out.println("1. Memory");
System.out.println("2. Mock");

int choice = Integer.parseInt(sc.nextLine());
MemberRepository repository;

if(choice == 1){
    repository = new MemoryMemberRepository();
}
else{
    repository = new MockMemberRepository();
}



MemberService service =
        new MemberService(repository);
