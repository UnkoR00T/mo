package lx1;

import a14.a0;
import android.system.ErrnoException;
import android.system.OsConstants;
import dx.i;
import fr.t;
import fu.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f!B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u001c\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Llx1/b;", "", "Llx1/b$a;", "Llx1/b$b;", "Lgy/a;", "permissionManager", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "<init>", "(Lgy/a;La14/a0;Laz/d;)V", "", "fileName", "", "fileBytes", "Ldx/i;", "Ldx/b;", "i", "(Ljava/lang/String;[BLtq/e;)Ljava/lang/Object;", "domainError", "", "h", "(Ldx/b;)Z", "fileNameWithExtension", "e", "(Ljava/lang/String;)Ljava/lang/String;", "f", "params", "g", "(Llx1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgy/a;", "b", "La14/a0;", "c", "Laz/d;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: lx1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Llx1/b$a;", "Lgz/b$a;", "", "fileName", "", "fileBytes", "<init>", "(Ljava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "[B", "()[B", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] fileBytes;

        public Params(String str, byte[] bArr) {
            this.fileName = str;
            this.fileBytes = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getFileBytes() {
            return this.fileBytes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fileName, params.fileName) && t.c(this.fileBytes, params.fileBytes);
        }

        public int hashCode() {
            return (this.fileName.hashCode() * 31) + Arrays.hashCode(this.fileBytes);
        }

        public String toString() {
            return "Params(fileName=" + this.fileName + ", fileBytes=" + Arrays.toString(this.fileBytes) + ')';
        }
    }

    /* JADX INFO: renamed from: lx1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Llx1/b$b;", "", "a", "c", "b", "Llx1/b$b$a;", "Llx1/b$b$b;", "Llx1/b$b$c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2959b {

        /* JADX INFO: renamed from: lx1.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llx1/b$b$a;", "Llx1/b$b;", "", "fileUri", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FileSaved implements InterfaceC2959b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fileUri;

            public FileSaved(String str) {
                this.fileUri = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getFileUri() {
                return this.fileUri;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FileSaved) && t.c(this.fileUri, ((FileSaved) other).fileUri);
            }

            public int hashCode() {
                return this.fileUri.hashCode();
            }

            public String toString() {
                return "FileSaved(fileUri=" + this.fileUri + ')';
            }
        }

        /* JADX INFO: renamed from: lx1.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llx1/b$b$b;", "Llx1/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2960b implements InterfaceC2959b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2960b f121085a = new C2960b();

            private C2960b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2960b);
            }

            public int hashCode() {
                return -493006241;
            }

            public String toString() {
                return "NoSpaceOnDevice";
            }
        }

        /* JADX INFO: renamed from: lx1.b$b$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llx1/b$b$c;", "Llx1/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC2959b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f121086a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1264503788;
            }

            public String toString() {
                return "NotPermissionGranted";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121088e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121090g;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121088e = obj;
            this.f121090g |= PKIFailureInfo.systemUnavail;
            return b.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121093f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121095h;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121093f = obj;
            this.f121095h |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, null, this);
        }
    }

    public b(gy.a aVar, a0 a0Var, az.d dVar) {
        this.permissionManager = aVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.fileConverter = dVar;
    }

    private final String e(String fileNameWithExtension) {
        return r.k1(fileNameWithExtension, ".", null, 2, null);
    }

    private final String f(String fileNameWithExtension) {
        return r.s1(fileNameWithExtension, ".", null, 2, null);
    }

    private final boolean h(dx.b domainError) {
        if (!(domainError instanceof dx.b.Generic)) {
            return false;
        }
        Throwable e15 = ((dx.b.Generic) domainError).getE();
        IOException iOException = e15 instanceof IOException ? (IOException) e15 : null;
        Throwable cause = iOException != null ? iOException.getCause() : null;
        ErrnoException errnoException = cause instanceof ErrnoException ? (ErrnoException) cause : null;
        return errnoException != null && errnoException.errno == OsConstants.ENOSPC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, byte[] bArr, e<? super i<? extends dx.b, ? extends InterfaceC2959b>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f121095h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f121095h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f121093f;
        Object objE = uq.b.e();
        int i16 = dVar.f121095h;
        if (i16 == 0) {
            u.b(objC);
            a0 a0Var = this.saveFilesOnDeviceUseCase;
            a0.Params params = new a0.Params(new ByteArrayInputStream(bArr), f(str) + "_podpisany", e(str));
            dVar.f121091d = j.a(str);
            dVar.f121092e = j.a(bArr);
            dVar.f121095h = 1;
            objC = a0Var.c(params, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            dx.b bVar = (dx.b) ((i.Left) iVar).b();
            return h(bVar) ? new i.Right(InterfaceC2959b.C2960b.f121085a) : new i.Left(bVar);
        }
        if (iVar instanceof i.Right) {
            return new i.Right(new InterfaceC2959b.FileSaved(this.fileConverter.a(new File((String) ((i.Right) iVar).b()))));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Params params, e<? super i<? extends dx.b, ? extends InterfaceC2959b>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f121090g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f121090g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f121088e;
        Object objE = uq.b.e();
        int i16 = cVar.f121090g;
        if (i16 == 0) {
            u.b(objD);
            gy.a aVar = this.permissionManager;
            gy.d dVar = gy.d.EXTERNAL_STORAGE;
            cVar.f121087d = params;
            cVar.f121090g = 1;
            objD = aVar.d(dVar, cVar);
            if (objD != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
            return objD;
        }
        params = (Params) cVar.f121087d;
        u.b(objD);
        gy.c cVar2 = (gy.c) objD;
        if (!t.c(cVar2, gy.c.a.f78236a)) {
            if ((cVar2 instanceof gy.c.NotGranted) || t.c(cVar2, gy.c.C1774c.f78238a)) {
                return new i.Right(InterfaceC2959b.c.f121086a);
            }
            throw new p();
        }
        String fileName = params.getFileName();
        byte[] fileBytes = params.getFileBytes();
        cVar.f121087d = j.a(params);
        cVar.f121090g = 2;
        Object objI = i(fileName, fileBytes, cVar);
        return objI == objE ? objE : objI;
    }
}
