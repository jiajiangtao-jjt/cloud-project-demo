package com.example.configserver.cloudapicommons.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("payment")
public class Payment {


    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
//    @ApiModelProperty(value = "")
    private String serial;

}
