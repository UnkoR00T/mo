package gw3;

import az.d;
import az.e;
import az.f;
import dx.i;
import java.io.ByteArrayInputStream;
import java.io.File;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgw3/a;", "", "Lgw3/a$a;", "Lwx/i$a;", "Laz/e;", "fileFactory", "Laz/f;", "fileManager", "Laz/d;", "fileConverter", "<init>", "(Laz/e;Laz/f;Laz/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgw3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Laz/e;", "b", "Laz/f;", "c", "Laz/d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e fileFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f fileManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d fileConverter;

    /* JADX INFO: renamed from: gw3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lgw3/a$a;", "Lgz/b$a;", "", "bytes", "<init>", "([B)V", "a", "[B", "()[B", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1771a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] bytes;

        public C1771a(byte[] bArr) {
            this.bytes = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78187g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78189j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78187g = obj;
            this.f78189j |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(e eVar, f fVar, d dVar) {
        this.fileFactory = eVar;
        this.fileManager = fVar;
        this.fileConverter = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(C1771a c1771a, tq.e<? super i<? extends dx.b, wx.i.Image>> eVar) throws Throwable {
        b bVar;
        C1771a c1771a2;
        File file;
        i iVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f78189j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f78189j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f78187g;
        Object objE = uq.b.e();
        int i16 = bVar.f78189j;
        if (i16 == 0) {
            u.b(objA);
            e eVar2 = this.fileFactory;
            String str = '.' + fw3.b.a();
            e.a aVar = e.a.PICTURES;
            bVar.f78184d = c1771a;
            bVar.f78189j = 1;
            objA = eVar2.a("id_captured_photo", str, aVar, bVar);
            if (objA != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c1771a = (C1771a) bVar.f78184d;
            u.b(objA);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) bVar.f78185e;
            c1771a2 = (C1771a) bVar.f78184d;
            u.b(objA);
        }
        iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            throw new p();
        }
        ((Boolean) ((i.Right) iVar).b()).getClass();
        return new i.Right(new wx.i.Image(new FilePickerMetadata("id_captured_photo", fw3.b.a(), c1771a2.getBytes().length, this.fileConverter.a(file)), new FileContent(c1771a2.getBytes())));
        File file2 = (File) objA;
        f fVar = this.fileManager;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c1771a.getBytes());
        String absolutePath = file2.getAbsolutePath();
        bVar.f78184d = c1771a;
        bVar.f78185e = file2;
        bVar.f78186f = 0;
        bVar.f78189j = 2;
        Object objD = fVar.d(byteArrayInputStream, absolutePath, bVar);
        if (objD != objE) {
            c1771a2 = c1771a;
            file = file2;
            objA = objD;
            iVar = (i) objA;
            if (iVar instanceof i.Left) {
                return iVar;
            }
            if (iVar instanceof i.Right) {
                throw new p();
            }
            ((Boolean) ((i.Right) iVar).b()).getClass();
            return new i.Right(new wx.i.Image(new FilePickerMetadata("id_captured_photo", fw3.b.a(), c1771a2.getBytes().length, this.fileConverter.a(file)), new FileContent(c1771a2.getBytes())));
        }
        return objE;
    }
}
