package x20;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f216548a;

    public k(Context context) {
        this.f216548a = context;
    }

    public String a(int i15) {
        try {
            InputStream inputStreamOpenRawResource = this.f216548a.getResources().openRawResource(i15);
            try {
                StringBuilder sb5 = new StringBuilder();
                while (true) {
                    int i16 = inputStreamOpenRawResource.read();
                    if (i16 == -1) {
                        String string = sb5.toString();
                        inputStreamOpenRawResource.close();
                        return string;
                    }
                    sb5.append((char) i16);
                    px.f.f163100a.d("Error loading raw resource", e, px.c.a(this));
                    return null;
                }
            } catch (Throwable th4) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e15) {
            px.f.f163100a.d("Error loading raw resource", e15, px.c.a(this));
            return null;
        }
    }
}
