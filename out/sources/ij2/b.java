package ij2;

import android.content.Context;
import android.content.SharedPreferences;
import dx.i;
import dx.j;
import iy.b0;
import iy.c0;
import iy.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jx.d;
import oq.g;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.legacy.storage.ContainerManagerNew;
import pl.gov.coi.mobywatel.feature.legacy.storage.k;
import px.f;
import tq.e;
import xw.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u001c0\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u0017H\u0002¢\u0006\u0004\b\"\u0010\u001fJ#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020)0\u00172\u0006\u0010(\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0\u0017H\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0018\u0010.\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b.\u0010/J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b0\u0010/J\u0018\u00102\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b2\u0010/J\u0018\u00103\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b3\u0010/J\u0010\u00104\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u000108H\u0096@¢\u0006\u0004\b<\u00105J\u000f\u0010=\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0013H\u0016¢\u0006\u0004\b?\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010D¨\u0006E"}, d2 = {"Lij2/b;", "Lu64/b;", "Landroid/content/Context;", "context", "Ljx/d;", "deviceInfo", "Liy/v;", "pkcs12Manager", "Lpx/d;", "remoteLogger", "Liy/a;", "base64Coder", "<init>", "(Landroid/content/Context;Ljx/d;Liy/v;Lpx/d;Liy/a;)V", "Loq/i0;", "s", "(Landroid/content/Context;)V", "Liy/b0;", "pass", "", "k", "(Liy/b0;)Z", "password", "Ldx/i;", "Ldx/b;", "l", "(Liy/b0;)Ldx/i;", "Lcj2/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "o", "n", "()Ldx/i;", "Lbj2/a;", "kotlin.jvm.PlatformType", "r", "", "containerUserBundleId", "Lbj2/c;", "q", "(I)Ldx/i;", "containerPassBundleId", "Lbj2/b;", "p", "", "Lcj2/a;", "m", "h", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "j", "Lu64/a;", "i", "d", "f", "(Ltq/e;)Ljava/lang/Object;", "a", "()V", "", "hashedPin", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "e", "b", "()Z", "c", "Landroid/content/Context;", "Ljx/d;", "Liy/v;", "Lpx/d;", "Liy/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements u64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d deviceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v pkcs12Manager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f93133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f93135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f93136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f93137h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f93138j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f93140l;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f93138j = obj;
            this.f93140l |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, this);
        }
    }

    public b(Context context, d dVar, v vVar, px.d dVar2, iy.a aVar) {
        this.context = context;
        this.deviceInfo = dVar;
        this.pkcs12Manager = vVar;
        this.remoteLogger = dVar2;
        this.base64Coder = aVar;
    }

    private final boolean k(b0 pass) {
        if (pass.getData().length == 0) {
            return false;
        }
        ContainerManagerNew.u().c();
        return o(pass).a() != null;
    }

    private final i<dx.b, i0> l(b0 password) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    ContainerManagerNew.u().o(this.context, this.deviceInfo, c0.e(password).getBytes(StandardCharsets.UTF_8), false);
                    return new i.Right(i0.f148189a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private final i<dx.b, List<cj2.a>> m() {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(((cj2.b) new ex.a().a(n())).g());
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final i<dx.b, cj2.b> n() {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarR = ContainerManagerNew.u().r();
                    if (bVarR != null) {
                        return new i.Right(bVarR);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("UserRepository, commonContainer is null")));
                    throw new g();
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final i<dx.b, cj2.b> o(b0 password) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(ContainerManagerNew.u().q(k.e().g(c0.e(password).getBytes(StandardCharsets.UTF_8), this.deviceInfo.b(), pl.gov.coi.mobywatel.feature.legacy.storage.d.USER)));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final i<dx.b, bj2.b> p(int containerPassBundleId) {
        Object objB;
        i<dx.b, bj2.b> left;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.b bVar = (bj2.b) ContainerManagerNew.u().z(bj2.b.class, containerPassBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
                    if (bVar != null) {
                        left = new i.Right<>(bVar);
                        if (left instanceof i.Left) {
                            px.b.y5(this.remoteLogger, "UserRepository, getContainerPass error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("UserRepository, containerPass with id:" + containerPassBundleId + " is null")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            left = new i.Left<>(objB);
        }
    }

    private final i<dx.b, bj2.c> q(int containerUserBundleId) {
        Object objB;
        i<dx.b, bj2.c> left;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) ContainerManagerNew.u().z(bj2.c.class, containerUserBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
                    if (cVar != null) {
                        left = new i.Right<>(cVar);
                        if (left instanceof i.Left) {
                            px.b.y5(this.remoteLogger, "UserRepository, getContainerUser error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("UserRepository, containerUser with id:" + containerUserBundleId + " is null")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            left = new i.Left<>(objB);
        }
    }

    private final i<dx.b, bj2.a> r() {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(ContainerManagerNew.u().s());
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private final void s(Context context) {
        sh2.d.d(context, "isContainerBuiltByImei", false);
    }

    @Override // u64.b
    public void a() {
        vi2.a.INSTANCE.a(sh2.a.h()).f();
        ContainerManagerNew.u().b();
        ij2.a.c(false);
    }

    @Override // u64.b
    public boolean b() {
        return ij2.a.a();
    }

    @Override // u64.b
    public boolean c() {
        return this.context.getSharedPreferences("mDoki_0.10", 0).getBoolean("activated", false);
    }

    @Override // u64.b
    public Object d(b0 b0Var, e<? super Boolean> eVar) {
        boolean z15 = false;
        try {
            s(this.context);
            String strE = iy.a.e(this.base64Coder, sh2.d.a(), null, 2, null);
            String strE2 = iy.a.e(this.base64Coder, sh2.d.a(), null, 2, null);
            SharedPreferences sharedPreferences = this.context.getSharedPreferences("mDoki_0.10", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("Salt", strE);
            editorEdit.putString("Salt2", strE2);
            editorEdit.putString("DEVICE_NAME", this.deviceInfo.c());
            editorEdit.commit();
            ContainerManagerNew.u().o(this.context, this.deviceInfo, new String(b0Var.getData()).getBytes(StandardCharsets.UTF_8), false);
            ContainerManagerNew.u().v(this.context);
            pl.gov.coi.mobywatel.feature.legacy.storage.e.c(this.context);
            ContainerManagerNew.l(this.context);
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putBoolean("activated", true);
            editorEdit2.apply();
            ij2.a.c(true);
            z15 = true;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            f.f163100a.d("UserRepositoryImpl error: activateApp()", e16, px.c.a(this));
        }
        return vq.b.a(z15);
    }

    @Override // u64.b
    public Object e(e<? super String> eVar) {
        cj2.b bVarA = n().a();
        if (bVarA != null) {
            return bVarA.o();
        }
        return null;
    }

    @Override // u64.b
    public Object f(e<? super Boolean> eVar) {
        boolean z15 = true;
        try {
            ij2.a.c(true);
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            f.f163100a.d("UserRepositoryImpl error: doAfterLogin()", e16, px.c.a(this));
            z15 = false;
        }
        return vq.b.a(z15);
    }

    @Override // u64.b
    public Object g(String str, e<? super i0> eVar) {
        cj2.b bVarA = n().a();
        if (bVarA != null) {
            bVarA.u(str);
        }
        if (bVarA != null) {
            bVarA.c();
        }
        return i0.f148189a;
    }

    @Override // u64.b
    public Object h(b0 b0Var, e<? super Boolean> eVar) {
        boolean z15;
        try {
            cj2.b bVarA = n().a();
            ArrayList<cj2.c> arrayList = new ArrayList();
            arrayList.add(bVarA);
            arrayList.add(r().a());
            List<cj2.a> listA = m().a();
            if (listA != null) {
                for (cj2.a aVar : listA) {
                    try {
                        if (!pq.v.q(aj2.a.PRESCRIPTION, aj2.a.IPOLAK, aj2.a.PKP, aj2.a.GIOS, aj2.a.MAKE_PROPOSAL, aj2.a.E_PAYMENTS).contains(aVar.i())) {
                            arrayList.add(q(aVar.b()).a());
                            arrayList.add(p(aVar.b()).a());
                        }
                    } catch (Exception e15) {
                        f.f163100a.d("ServiceManager legacy error: changePassword()", e15, px.c.a(this));
                    }
                }
            }
            l(b0Var);
            for (cj2.c cVar : arrayList) {
                if (cVar != null) {
                    cVar.c();
                }
            }
            z15 = true;
        } catch (CancellationException e16) {
            throw e16;
        } catch (Exception e17) {
            f.f163100a.d("UserRepositoryImpl error: changeUserPassword()", e17, px.c.a(this));
            z15 = false;
        }
        return vq.b.a(z15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // u64.b
    public Object i(b0 b0Var, e<? super u64.a> eVar) throws Throwable {
        a aVar;
        cj2.b bVar;
        String str = "";
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f93140l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f93140l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f93138j;
        Object objE = uq.b.e();
        int i16 = aVar.f93140l;
        try {
            if (i16 == 0) {
                u.b(obj);
                SharedPreferences sharedPreferences = this.context.getSharedPreferences("mDoki_0.10", 0);
                String string = sharedPreferences.getString("Salt", "");
                if (string == null) {
                    string = "";
                }
                String string2 = sharedPreferences.getString("Salt2", "");
                if (string2 != null) {
                    str = string2;
                }
                if (string.length() != 0 && str.length() != 0) {
                    ContainerManagerNew.u().b();
                    ContainerManagerNew.u().n(this.context, this.deviceInfo, c0.e(b0Var).getBytes(StandardCharsets.UTF_8));
                    if (pl.gov.coi.mobywatel.feature.legacy.storage.e.a(this.context)) {
                        pl.gov.coi.mobywatel.feature.legacy.storage.e eVar2 = new pl.gov.coi.mobywatel.feature.legacy.storage.e();
                        if (!eVar2.b(this.context)) {
                            return u64.a.LOGIN_ERROR;
                        }
                        try {
                            eVar2.e(this.context);
                        } catch (uh2.a unused) {
                            return u64.a.ACTIVATION_ERROR;
                        }
                    }
                    cj2.b bVarA = n().a();
                    if (bVarA == null) {
                        return u64.a.LOGIN_ERROR;
                    }
                    vi2.a aVarA = vi2.a.INSTANCE.a(this.pkcs12Manager);
                    aVar.f93133d = vq.j.a(b0Var);
                    aVar.f93134e = vq.j.a(sharedPreferences);
                    aVar.f93135f = vq.j.a(string);
                    aVar.f93136g = vq.j.a(str);
                    aVar.f93137h = bVarA;
                    aVar.f93140l = 1;
                    if (aVarA.o(aVar) == objE) {
                        return objE;
                    }
                    bVar = bVarA;
                }
                return u64.a.ACTIVATION_ERROR;
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (cj2.b) aVar.f93137h;
            u.b(obj);
            bVar.t(bVar.p());
            ij2.a.c(true);
            return u64.a.LOGIN_SUCCESS;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception unused2) {
            return u64.a.UNKNOWN_ERROR;
        }
    }

    @Override // u64.b
    public Object j(b0 b0Var, e<? super i<? extends dx.b, Boolean>> eVar) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        return new i.Right(vq.b.a(k(b0Var)));
                    } catch (Exception e15) {
                        aVar.b(new dx.b.InterfaceC1027b.a.UnknownError(0, e15, 1, null));
                        throw new g();
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            f fVar = f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
