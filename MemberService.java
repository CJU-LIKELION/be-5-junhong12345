import java.util.List;

public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public void register(Role role) {

        if(repository.existsByName(role.getName())){
            System.out.println("이미 존재하는 이름입니다.");
            return;
        }

        repository.save(role);

        System.out.println("등록 완료 : " + role.getName());
    }

    public void searchMember(String name){

        Role role = repository.findByName(name);

        if(role == null){
            System.out.println("검색 결과 없음");
            return;
        }

        System.out.println(role);
    }

    public void showAllMembers(){

        List<Role> list = repository.findAll();

        for(Role role : list){
            System.out.println(role);
        }
    }
}
