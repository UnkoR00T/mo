package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes5.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    void setAllowContentAccess(boolean z15);

    void setAllowFileAccess(boolean z15);

    void setBlockNetworkLoads(boolean z15);

    void setCacheMode(int i15);

    void setIncludeCookiesOnIntercept(boolean z15);
}
