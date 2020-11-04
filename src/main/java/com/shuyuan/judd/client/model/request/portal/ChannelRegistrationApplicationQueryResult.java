package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.ChannelRegistrationApplication;
import lombok.Data;

import java.util.List;

@Data
public class ChannelRegistrationApplicationQueryResult extends QueryResult {
    private List<ChannelRegistrationApplication> list;
}
