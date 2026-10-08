package ig;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public interface i {
    <T extends h> T c(String str, Class<T> cls);

    void d(String str, h hVar);

    Activity g();

    void startActivityForResult(Intent intent, int i15);
}
