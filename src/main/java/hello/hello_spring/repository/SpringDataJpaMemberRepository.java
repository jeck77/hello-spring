package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // select m from Member m where m.name
    // findBy** 으로 네이밍 룰을 지키면 자동으로 찾아줌
    // findBy**and** and로 조건 추가해서 찾음
    // 페이징 기능 자동 제공
    Optional<Member> findByName(String name);
}