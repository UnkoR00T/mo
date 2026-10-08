package fp;

import bp.f;
import bp.h;
import bp.i;
import bp.j;
import bp.p;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f65778b = {32};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f65779c = {10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f65780a;

    public d(OutputStream outputStream) {
        this.f65780a = outputStream;
    }

    private void a(Object obj) throws IOException {
        if (obj instanceof p) {
            b.D1((p) obj, this.f65780a);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof f) {
            ((f) obj).i4(this.f65780a);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof h) {
            ((h) obj).j4(this.f65780a);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof bp.c) {
            ((bp.c) obj).J3(this.f65780a);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof i) {
            ((i) obj).N3(this.f65780a);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof bp.a) {
            bp.a aVar = (bp.a) obj;
            this.f65780a.write(b.f65746h0);
            for (int i15 = 0; i15 < aVar.size(); i15++) {
                a(aVar.g4(i15));
            }
            this.f65780a.write(b.f65747q0);
            this.f65780a.write(f65778b);
            return;
        }
        if (obj instanceof bp.d) {
            this.f65780a.write(b.D);
            for (Map.Entry<i, bp.b> entry : ((bp.d) obj).entrySet()) {
                if (entry.getValue() != null) {
                    a(entry.getKey());
                    a(entry.getValue());
                }
            }
            this.f65780a.write(b.E);
            this.f65780a.write(f65778b);
            return;
        }
        if (!(obj instanceof ap.a)) {
            if (!(obj instanceof j)) {
                throw new IOException("Error:Unknown type in content stream:" + obj);
            }
            this.f65780a.write("null".getBytes(xp.a.f220415d));
            this.f65780a.write(f65778b);
            return;
        }
        ap.a aVar2 = (ap.a) obj;
        if (!aVar2.c().equals("BI")) {
            this.f65780a.write(aVar2.c().getBytes(xp.a.f220415d));
            this.f65780a.write(f65779c);
            return;
        }
        this.f65780a.write("BI".getBytes(xp.a.f220415d));
        this.f65780a.write(f65779c);
        bp.d dVarB = aVar2.b();
        for (i iVar : dVarB.O4()) {
            bp.b bVarP4 = dVarB.p4(iVar);
            iVar.N3(this.f65780a);
            this.f65780a.write(f65778b);
            a(bVarP4);
            this.f65780a.write(f65779c);
        }
        OutputStream outputStream = this.f65780a;
        Charset charset = xp.a.f220415d;
        outputStream.write("ID".getBytes(charset));
        OutputStream outputStream2 = this.f65780a;
        byte[] bArr = f65779c;
        outputStream2.write(bArr);
        this.f65780a.write(aVar2.a());
        this.f65780a.write(bArr);
        this.f65780a.write("EI".getBytes(charset));
        this.f65780a.write(bArr);
    }

    public void b(List<?> list) throws IOException {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void c(Object... objArr) throws IOException {
        for (Object obj : objArr) {
            a(obj);
        }
        this.f65780a.write("\n".getBytes(xp.a.f220412a));
    }
}
