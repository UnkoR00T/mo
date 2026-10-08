package az;

import dx.i;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J6\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000f\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000f\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H¦@¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H¦@¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u0004H¦@¢\u0006\u0004\b#\u0010\u001eJ\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c0\bH¦@¢\u0006\u0004\b$\u0010%J$\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u001f\u001a\u00020\u0004H¦@¢\u0006\u0004\b&\u0010\u001eJ\u0019\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Laz/f;", "", "", "bytes", "", "fileName", "", "excludeFromRegister", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "([BLjava/lang/String;ZLtq/e;)Ljava/lang/Object;", "Ljava/io/InputStream;", "input", "filePath", "d", "(Ljava/io/InputStream;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "fileExtension", "a", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Laz/g;", "e", "(Laz/g;Ltq/e;)Ljava/lang/Object;", "j", "l", "path", "", "Ljava/io/File;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "uri", "m", "f", "", "k", "g", "(Ltq/e;)Ljava/lang/Object;", "n", "i", "(Ljava/lang/String;)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    static /* synthetic */ Object b(f fVar, byte[] bArr, String str, boolean z15, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFile");
        }
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return fVar.c(bArr, str, z15, eVar);
    }

    Object a(InputStream inputStream, String str, String str2, tq.e<? super i<? extends dx.b, String>> eVar);

    Object c(byte[] bArr, String str, boolean z15, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object d(InputStream inputStream, String str, tq.e<? super i<? extends dx.b, Boolean>> eVar);

    Object e(g gVar, tq.e<? super i<? extends dx.b, Boolean>> eVar);

    Object f(String str, tq.e<? super String> eVar);

    Object g(tq.e<? super i<? extends dx.b, ? extends File>> eVar);

    Object h(String str, tq.e<? super i<? extends dx.b, ? extends List<? extends File>>> eVar);

    String i(String uri);

    Object j(g gVar, tq.e<? super i<? extends dx.b, Boolean>> eVar);

    Object k(String str, tq.e<? super Float> eVar);

    Object l(g gVar, tq.e<? super i<? extends dx.b, byte[]>> eVar);

    Object m(String str, tq.e<? super i<? extends dx.b, byte[]>> eVar);

    Object n(String str, tq.e<? super i<? extends dx.b, ? extends File>> eVar);
}
