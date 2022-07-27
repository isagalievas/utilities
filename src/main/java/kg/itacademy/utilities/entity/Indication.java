package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name = "indication")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Indication extends BaseEntity {
    //фио плательщика
    String fullNameOfPayer;
    //лицевой счёт
    Long personalAccount;
    //адресс плательщика
    String addressOfPayer;
    //дата этого показание
    LocalDate dateOfIndication;
    //само показание
    Long indication;
}
