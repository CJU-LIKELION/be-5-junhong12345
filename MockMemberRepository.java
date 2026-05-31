import java.util.ArrayList;
import java.util.List;

public class MockMemberRepository implements MemberRepository {

    @Override
    public void save(Role role) {
        System.out.println("[MOCK] 저장 완료");
    }

    @Override
    public Role findByName(String name) {

        return new Lion(
                "김사자",
                "컴퓨터공학과",
                14,
                "백엔드",
                "2020202020"
        );
    }

    @Override
    public List<Role> findAll() {

        List<Role> list = new ArrayList<>();

        list.add(
                new Lion(
                        "김사자",
                        "컴퓨터공학과",
                        14,
                        "백엔드",
                        "2020202020"
                )
        );

        return list;
    }

    @Override
    public boolean existsByName(String name) {
        return false;
    }
}
