package com.boyma.mxsmpl.ui.MainActivity;

import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.boyma.mxsmpl.base.IBaseMvpView;
import com.boyma.mxsmpl.net.jsonplaceholder.allnews.models.ResponseJsonObj;

import java.util.List;

public interface IMainActivityView extends IBaseMvpView {

    void showLoadingDialog();

    void hideLogTextView();

    void hideLoadingView();

    void addToList(List<ResponseJsonObj> siteJsonObj);

    @StateStrategyType(SkipStrategy.class)
    void startDocsActivity(Integer id);
}
