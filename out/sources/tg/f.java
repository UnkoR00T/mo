package tg;

import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z15, int i15);

    int getIntFlagValue(String str, int i15, int i16);

    long getLongFlagValue(String str, long j15, int i15);

    String getStringFlagValue(String str, String str2, int i15);

    void init(rg.b bVar);
}
