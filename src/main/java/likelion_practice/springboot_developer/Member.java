package likelion_practice.springboot_developer;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable=false)
    private Long id;

    @Column(name="name",nullable=false)
    private String name;

    //id를 직접 지정하면 jpa는 이 member가 이미 DB에 있다고 착각하고 merge시도함
    //그런데 실제 DB에는 없으니까 (행이없음) 발생
    //id는 직접 넣지 말고 자동으로 생성되도록
    public Member(String name) {
        this.name=name;
    }
    public void changeName(String name) {
        this.name=name;
    }
}

