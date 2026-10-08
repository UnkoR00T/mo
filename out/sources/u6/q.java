package u6;

import android.os.Parcel;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "parentDirPath", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "c", "(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;", "", "", "a", "(Ljava/lang/Throwable;)Z", "", "b", "()I", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {
    public static final boolean a(Throwable th4) {
        try {
            return fr.t.c((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "sys.user." + b() + ".ce_available", "false"), "true");
        } catch (Throwable th5) {
            oq.c.a(th4, th5);
            return false;
        }
    }

    private static final int b() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final Exception c(String str, Exception exc) {
        if (a(exc) || str == null) {
            return exc;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exc;
        } catch (IOException unused) {
            return new r(exc);
        } finally {
            file.delete();
        }
    }
}
