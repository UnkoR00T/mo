package pl.gov.coi.mobywatel.feature.legacy.storage;

import java.util.concurrent.CancellationException;
import k34.u;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.StoredMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010\u000b\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010\u000b\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010)\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0\f2\u0006\u0010)\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b-\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u001c\u00105\u001a\n 2*\u0004\u0018\u000101018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lpl/gov/coi/mobywatel/feature/legacy/storage/f;", "Lz04/a;", "Lg34/c;", "identityManager", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lg34/c;Lez/a;Lez/e;)V", "Lwx/i;", "pickedFile", "Ldx/i;", "Ldx/b;", "Lwx/l;", "j", "(Lwx/i;)Ldx/i;", "", "fileName", "Loq/i0;", "h", "(Ljava/lang/String;)Ldx/i;", "l", "Lcj2/a;", "bundleDescription", "i", "(Lcj2/a;)V", "Lk34/u;", "Laj2/a;", "k", "(Lk34/u;)Laj2/a;", "g", "()Ljava/lang/String;", "Lwx/i$a;", "Lwx/k$a;", "a", "(Lwx/i$a;Ltq/e;)Ljava/lang/Object;", "Lwx/i$b;", "Lwx/k$b;", "d", "(Lwx/i$b;Ltq/e;)Ljava/lang/Object;", "name", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lwx/c;", "b", "Lg34/c;", "Lez/a;", "Lez/e;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/ContainerManagerNew;", "kotlin.jvm.PlatformType", "f", "()Lpl/gov/coi/mobywatel/feature/legacy/storage/ContainerManagerNew;", "container", "Lcj2/b;", "e", "()Lcj2/b;", "commonContainer", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements z04.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f158769e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158773a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f158773a = iArr;
        }
    }

    public f(g34.c cVar, ez.a aVar, ez.e eVar) {
        this.identityManager = cVar;
        this.currentTimeProvider = aVar;
        this.dateFormatter = eVar;
    }

    private final cj2.b e() {
        return f().r();
    }

    private final ContainerManagerNew f() {
        return ContainerManagerNew.u();
    }

    private final String g() {
        return "file_container_" + this.dateFormatter.d(new fz.b.LocalDateTime(this.currentTimeProvider.i()), fz.c.NO_SPACES);
    }

    private final dx.i<dx.b, i0> h(String fileName) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarE = e();
                    if (bVarE == null) {
                        aVar.b(new dx.b.Generic(new Exception("CommonContainer cannot be null")));
                        throw new oq.g();
                    }
                    Object objA = g34.c.b(this.identityManager, false, 1, null).a();
                    if (objA == null) {
                        aVar.b(new dx.b.Generic(new Exception("mainIdentity cannot be null")));
                        throw new oq.g();
                    }
                    cj2.a aVarL = bVarE.l(k((u) objA));
                    aVarL.c().add(fileName);
                    i(aVarL);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA2 = jVarA.a(e15);
                    if (objA2 instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                    } else {
                        if (!(objA2 instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA2).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final void i(cj2.a bundleDescription) {
        ((bj2.c) f().z(bj2.c.class, bundleDescription.b(), d.USER)).c();
    }

    private final dx.i<dx.b, StoredMetadata> j(wx.i pickedFile) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    String strG = g();
                    f().H(strG, d.USER, pickedFile.getFileContent().getBytes());
                    h(strG);
                    return new dx.i.Right(new StoredMetadata(strG, pickedFile.getMetadata().getExtension(), pickedFile.getMetadata().getSizeInBytes()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final aj2.a k(u uVar) {
        int i15 = b.f158773a[uVar.ordinal()];
        if (i15 == 1) {
            return aj2.a.TOZSAMOSC;
        }
        if (i15 == 2) {
            return aj2.a.REFUGEE;
        }
        if (i15 == 3) {
            return aj2.a.STUDENT_CARD;
        }
        throw new p();
    }

    private final dx.i<dx.b, i0> l(String fileName) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarE = e();
                    if (bVarE == null) {
                        aVar.b(new dx.b.Generic(new Exception("CommonContainer cannot be null")));
                        throw new oq.g();
                    }
                    for (cj2.a aVar2 : bVarE.g()) {
                        if (aVar2.c().contains(fileName)) {
                            aVar2.c().remove(fileName);
                            i(aVar2);
                        }
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // z04.a
    public Object a(wx.i.Image image, tq.e<? super dx.i<? extends dx.b, wx.k.Image>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new wx.k.Image((StoredMetadata) new ex.a().a(j(image))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // z04.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, FileContent>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(new FileContent(f().E(d.USER, str)));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // z04.a
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    f().h(str);
                    l(str);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // z04.a
    public Object d(wx.i.Regular regular, tq.e<? super dx.i<? extends dx.b, wx.k.Regular>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new wx.k.Regular((StoredMetadata) new ex.a().a(j(regular))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
