package yp;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a<b> f228377a;

    static {
        a<b> aVar = new a<>();
        f228377a = aVar;
        aVar.c(b.UNKNOWN);
        aVar.a(b.JPEG, new byte[]{-1, -40});
        b bVar = b.TIFF;
        Charset charset = xp.a.f220415d;
        aVar.a(bVar, "II".getBytes(charset), new byte[]{42, 0});
        aVar.a(bVar, "MM".getBytes(charset), new byte[]{0, 42});
        aVar.a(b.PSD, "8BPS".getBytes(charset));
        aVar.a(b.PNG, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        aVar.a(b.BMP, "BM".getBytes(charset));
        b bVar2 = b.GIF;
        aVar.a(bVar2, "GIF87a".getBytes(charset));
        aVar.a(bVar2, "GIF89a".getBytes(charset));
        aVar.a(b.ICO, new byte[]{0, 0, 1, 0});
        b bVar3 = b.PCX;
        aVar.a(bVar3, new byte[]{10, 0, 1});
        aVar.a(bVar3, new byte[]{10, 2, 1});
        aVar.a(bVar3, new byte[]{10, 3, 1});
        aVar.a(bVar3, new byte[]{10, 5, 1});
        aVar.a(b.RIFF, "RIFF".getBytes(charset));
        aVar.a(b.CRW, "II".getBytes(charset), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes(charset));
        aVar.a(b.CR2, "II".getBytes(charset), new byte[]{42, 0, 16, 0, 0, 0, 67, 82});
        aVar.a(b.NEF, "MM".getBytes(charset), new byte[]{0, 42, 0, 0, 0, -128, 0});
        b bVar4 = b.ORF;
        aVar.a(bVar4, "IIRO".getBytes(charset), new byte[]{8, 0});
        aVar.a(bVar4, "IIRS".getBytes(charset), new byte[]{8, 0});
        aVar.a(b.RAF, "FUJIFILMCCD-RAW".getBytes(charset));
        aVar.a(b.RW2, "II".getBytes(charset), new byte[]{85, 0});
    }

    public static b a(byte[] bArr) {
        return f228377a.b(bArr);
    }
}
