package y14;

import az.e;
import fr.t;
import java.io.File;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sx.f;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly14/a;", "Lh14/a;", "Lrx/a;", "cameraManager", "Laz/e;", "fileFactory", "<init>", "(Lrx/a;Laz/e;)V", "Lh14/a$a;", "params", "Lh14/a$b;", "d", "(Lh14/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrx/a;", "b", "Laz/e;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rx.a cameraManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e fileFactory;

    /* JADX INFO: renamed from: y14.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5965a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223351a;

        static {
            int[] iArr = new int[f.Failure.a.values().length];
            try {
                iArr[f.Failure.a.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Failure.a.NOT_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.Failure.a.FRAMEWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.Failure.a.SAVING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.Failure.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f223351a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f223353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223355g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f223357j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f223355g = obj;
            this.f223357j |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(rx.a aVar, e eVar) {
        this.cameraManager = aVar;
        this.fileFactory = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h14.a.Params params, tq.e<? super h14.a.b> eVar) throws Throwable {
        b bVar;
        String str;
        f fVar;
        int i15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i16 = bVar.f223357j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f223357j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f223355g;
        Object objE = uq.b.e();
        int i17 = bVar.f223357j;
        if (i17 == 0) {
            u.b(objA);
            e eVar2 = this.fileFactory;
            String fileName = params.getFileName();
            String str2 = '.' + params.getExtension();
            e.a aVar = e.a.PICTURES;
            bVar.f223352d = j.a(params);
            bVar.f223357j = 1;
            objA = eVar2.a(fileName, str2, aVar, bVar);
            if (objA != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            params = (h14.a.Params) bVar.f223352d;
            u.b(objA);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f223353e;
            u.b(objA);
        }
        fVar = (f) objA;
        if (t.c(fVar, f.a.f185180a)) {
            return h14.a.b.C1817a.f79648a;
        }
        if (fVar instanceof f.Failure) {
            if (t.c(fVar, f.c.f185189a)) {
                return new h14.a.b.Success(str);
            }
            throw new p();
        }
        i15 = C5965a.f223351a[((f.Failure) fVar).getReason().ordinal()];
        if (i15 != 1) {
            return h14.a.b.C1817a.f79648a;
        }
        if (i15 != 2 || i15 == 3 || i15 == 4 || i15 == 5) {
            return h14.a.b.C1818b.f79649a;
        }
        throw new p();
        String absolutePath = ((File) objA).getAbsolutePath();
        rx.a aVar2 = this.cameraManager;
        bVar.f223352d = j.a(params);
        bVar.f223353e = absolutePath;
        bVar.f223354f = 0;
        bVar.f223357j = 2;
        Object objB = aVar2.b(absolutePath, bVar);
        if (objB != objE) {
            objA = objB;
            str = absolutePath;
            fVar = (f) objA;
            if (t.c(fVar, f.a.f185180a)) {
                return h14.a.b.C1817a.f79648a;
            }
            if (fVar instanceof f.Failure) {
                if (t.c(fVar, f.c.f185189a)) {
                    return new h14.a.b.Success(str);
                }
                throw new p();
            }
            i15 = C5965a.f223351a[((f.Failure) fVar).getReason().ordinal()];
            if (i15 != 1) {
                return h14.a.b.C1817a.f79648a;
            }
            if (i15 != 2) {
            }
            return h14.a.b.C1818b.f79649a;
        }
        return objE;
    }
}
