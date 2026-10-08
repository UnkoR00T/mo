package qw;

import android.hardware.fingerprint.FingerprintManager;
import androidx.fragment.app.p;
import ax.BiometricAuthLabels;
import ax.c;
import ax.e;
import dx.Vendor;
import dx.h;
import dx.i;
import fr.n0;
import iy.f0;
import iy.t;
import iy.u;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import ju.g1;
import ju.j;
import ju.n;
import ju.p0;
import mx.Label;
import oq.i0;
import oq.r;
import oq.y;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p010PrN.l1;
import p010PrN.m1;
import p071kotlin.Metadata;
import pq.v;
import px.d;
import px.f;
import vq.g;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u0004\u0018\u00010\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!H\u0016¢\u0006\u0004\b#\u0010$J1\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*JZ\u00106\u001a\u0002052\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020(2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!2\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020(02\u0012\u0006\u0012\u0004\u0018\u00010301H\u0096@¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0018\u0010\u001e\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lqw/a;", "Lax/e;", "Lqw/b;", "Liy/u;", "keyguardManager", "Liy/t;", "keyStoreProvider", "Lpx/d;", "remoteLogger", "<init>", "(Liy/u;Liy/t;Lpx/d;)V", "Lax/d;", "", "o", "(Lax/d;)I", "", "alias", "Ldx/i;", "Ldx/b;", "Loq/i0;", "p", "(Ljava/lang/String;)Ldx/i;", "Landroid/hardware/fingerprint/FingerprintManager;", "k", "()Landroid/hardware/fingerprint/FingerprintManager;", "code", "errString", "n", "(ILjava/lang/String;)Ldx/b;", "LCON/p;", "activity", "e", "(LCON/p;)V", "", "strength", "c", "(Ljava/util/List;)Ljava/lang/Integer;", "keyAlias", "d", "(Ljava/util/List;Ljava/lang/String;)Ldx/i;", "", "l", "()Z", "m", "Lax/c;", "mode", "Lax/b;", "labels", "confirmationRequired", "Lkotlin/Function2;", "Ltq/e;", "", "onUnrecognized", "Lax/a;", "a", "(Lax/c;Lax/b;ZLjava/util/List;Ler/p;Ltq/e;)Ljava/lang/Object;", "j", "()V", "Liy/u;", "b", "Liy/t;", "Lpx/d;", "Landroidx/fragment/app/p;", "Landroidx/fragment/app/p;", "LPrN/l1;", "LPrN/l1;", "biometricManager", "LPrN/m1;", "f", "LPrN/m1;", "biometricPrompt", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e, qw.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u keyguardManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p activity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l1 biometricManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private m1 biometricPrompt;

    /* JADX INFO: renamed from: qw.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4273a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169122a;

        static {
            int[] iArr = new int[ax.d.values().length];
            try {
                iArr[ax.d.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ax.d.WEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ax.d.DEVICE_CREDENTIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f169122a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lax/a;", "<anonymous>", "(Lju/p0;)Lax/a;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements er.p<p0, tq.e<? super ax.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f169124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f169125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f169126h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f169127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f169128k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f169129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f169130m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p f169132p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ m1.d.a f169133q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f169134r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0 f169135s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ er.p<Integer, tq.e<? super Boolean>, Object> f169136t;

        /* JADX INFO: renamed from: qw.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"qw/a$b$a", "LPrN/m1$a;", "LPrN/m1$b;", "result", "Loq/i0;", "c", "(LPrN/m1$b;)V", "b", "()V", "", "errorCode", "", "errString", "a", "(ILjava/lang/CharSequence;)V", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C4274a extends m1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f169137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f169138b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n<ax.a> f169139c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f169140d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ er.p<Integer, tq.e<? super Boolean>, Object> f169141e;

            /* JADX INFO: renamed from: qw.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            static final class C4275a extends k implements er.p<p0, tq.e<? super Boolean>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169142e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ er.p<Integer, tq.e<? super Boolean>, Object> f169143f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ n0 f169144g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C4275a(er.p<? super Integer, ? super tq.e<? super Boolean>, ? extends Object> pVar, n0 n0Var, tq.e<? super C4275a> eVar) {
                    super(2, eVar);
                    this.f169143f = pVar;
                    this.f169144g = n0Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f169142e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return obj;
                    }
                    oq.u.b(obj);
                    er.p<Integer, tq.e<? super Boolean>, Object> pVar = this.f169143f;
                    Integer numE = vq.b.e(this.f169144g.f66407a);
                    this.f169142e = 1;
                    Object objB = pVar.B(numE, this);
                    return objB == objE ? objE : objB;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
                    return ((C4275a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C4275a(this.f169143f, this.f169144g, eVar);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C4274a(a aVar, c cVar, n<? super ax.a> nVar, n0 n0Var, er.p<? super Integer, ? super tq.e<? super Boolean>, ? extends Object> pVar) {
                this.f169137a = aVar;
                this.f169138b = cVar;
                this.f169139c = nVar;
                this.f169140d = n0Var;
                this.f169141e = pVar;
            }

            @Override // PrN.m1.a
            public void a(int errorCode, CharSequence errString) {
                super.a(errorCode, errString);
                this.f169137a.remoteLogger.F8("BiometricPrompt auth: error (" + errorCode + "), completed (" + this.f169139c.r() + ')', d.a.ERROR);
                if (this.f169139c.r()) {
                    return;
                }
                try {
                    this.f169139c.i(oq.t.b((errorCode == 3 || errorCode == 5 || errorCode == 10 || errorCode == 13) ? ax.a.C0334a.f14850a : new ax.a.Error(this.f169137a.n(errorCode, errString.toString()))));
                    this.f169137a.j();
                } catch (IllegalStateException unused) {
                }
            }

            @Override // PrN.m1.a
            public void b() {
                super.b();
                n0 n0Var = this.f169140d;
                n0Var.f66407a++;
                boolean zBooleanValue = ((Boolean) j.b(null, new C4275a(this.f169141e, n0Var, null), 1, null)).booleanValue();
                this.f169137a.remoteLogger.F8("BiometricPrompt auth: failed (attempts: " + this.f169140d.f66407a + ", continue: " + zBooleanValue + ')', d.a.GENERAL);
                if (zBooleanValue) {
                    return;
                }
                n<ax.a> nVar = this.f169139c;
                oq.t.Companion companion = oq.t.INSTANCE;
                nVar.i(oq.t.b(new ax.a.Failed(this.f169140d.f66407a)));
                this.f169137a.j();
            }

            @Override // PrN.m1.a
            public void c(m1.b result) {
                r rVarA;
                ax.a.Succeeded.EnumC0335a enumC0335a;
                super.c(result);
                f.f163100a.b("onAuthenticationSucceeded, result: " + result, px.c.a(this.f169137a));
                m1.c cVarB = result.b();
                Cipher cipherA = cVarB != null ? cVarB.a() : null;
                d dVar = this.f169137a.remoteLogger;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("BiometricPrompt auth: cipher provider: ");
                sb5.append(cipherA != null ? cipherA.getProvider() : null);
                dVar.F8(sb5.toString(), d.a.GENERAL);
                if (cipherA != null) {
                    try {
                        GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) cipherA.getParameters().getParameterSpec(GCMParameterSpec.class);
                        rVarA = y.a(Integer.valueOf(gCMParameterSpec.getTLen()), gCMParameterSpec.getIV());
                    } catch (InvalidParameterSpecException unused) {
                        rVarA = y.a(-1, new byte[0]);
                    }
                    int iIntValue = ((Number) rVarA.a()).intValue();
                    byte[] bArr = (byte[]) rVarA.b();
                    f fVar = f.f163100a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Cipher is:\ncipher: ");
                    sb6.append(cipherA);
                    sb6.append("\nAlgorithm: ");
                    sb6.append(cipherA.getAlgorithm());
                    sb6.append("\nBlockSize: ");
                    sb6.append(cipherA.getBlockSize());
                    sb6.append("\nIv: ");
                    byte[] iv4 = cipherA.getIV();
                    sb6.append(iv4 != null ? pq.n.K0(iv4, null, null, null, 0, null, null, 63, null) : null);
                    sb6.append("\nGCM IV: ");
                    sb6.append(bArr != null ? pq.n.K0(bArr, null, null, null, 0, null, null, 63, null) : null);
                    sb6.append("\nGCM TagLen: ");
                    sb6.append(iIntValue);
                    sb6.append('\n');
                    fVar.b(sb6.toString(), px.c.a(this.f169137a));
                }
                if ((this.f169138b instanceof c.Encryption) && cipherA == null) {
                    n<ax.a> nVar = this.f169139c;
                    oq.t.Companion companion = oq.t.INSTANCE;
                    nVar.i(oq.t.b(new ax.a.Error(new dx.b.Generic(new NullPointerException("Cipher is null for encryption mode")))));
                } else {
                    n<ax.a> nVar2 = this.f169139c;
                    int iA = result.a();
                    if (iA != 1) {
                        enumC0335a = iA != 2 ? ax.a.Succeeded.EnumC0335a.UNKNOWN : ax.a.Succeeded.EnumC0335a.BIOMETRIC;
                    } else {
                        enumC0335a = ax.a.Succeeded.EnumC0335a.DEVICE_CREDENTIAL;
                    }
                    nVar2.i(oq.t.b(new ax.a.Succeeded(cipherA, enumC0335a)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p pVar, m1.d.a aVar, c cVar, n0 n0Var, er.p<? super Integer, ? super tq.e<? super Boolean>, ? extends Object> pVar2, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f169132p = pVar;
            this.f169133q = aVar;
            this.f169134r = cVar;
            this.f169135s = n0Var;
            this.f169136t = pVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169130m;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            a aVar = a.this;
            p pVar = this.f169132p;
            m1.d.a aVar2 = this.f169133q;
            c cVar = this.f169134r;
            n0 n0Var = this.f169135s;
            er.p<Integer, tq.e<? super Boolean>, Object> pVar2 = this.f169136t;
            this.f169123e = aVar;
            this.f169124f = pVar;
            this.f169125g = aVar2;
            this.f169126h = cVar;
            this.f169127j = n0Var;
            this.f169128k = pVar2;
            this.f169129l = 0;
            this.f169130m = 1;
            ju.p pVar3 = new ju.p(uq.b.c(this), 1);
            pVar3.D();
            aVar.biometricPrompt = new m1(pVar, u5.a.i(pVar), new C4274a(aVar, cVar, pVar3, n0Var, pVar2));
            try {
                m1.d dVarA = aVar2.a();
                aVar.remoteLogger.F8("BiometricPrompt: (type: " + dVarA.a() + ", confirmation: " + dVarA.f() + ')', d.a.GENERAL);
                if (cVar instanceof c.Encryption) {
                    m1 m1Var = aVar.biometricPrompt;
                    if (m1Var != null) {
                        m1Var.b(aVar2.a(), new m1.c(((c.Encryption) cVar).getInitializedCipher()));
                    }
                } else {
                    if (!fr.t.c(cVar, c.b.f14865a)) {
                        throw new oq.p();
                    }
                    m1 m1Var2 = aVar.biometricPrompt;
                    if (m1Var2 != null) {
                        m1Var2.a(aVar2.a());
                    }
                }
            } catch (CancellationException e15) {
                throw e15;
            } catch (Exception unused) {
                aVar.remoteLogger.F8("BiometricPrompt failed configuration", d.a.ERROR);
                oq.t.Companion companion = oq.t.INSTANCE;
                pVar3.i(oq.t.b(new ax.a.Error(dx.b.j.c.f45087a)));
            }
            Object objX = pVar3.x();
            if (objX == uq.b.e()) {
                g.c(this);
            }
            return objX == objE ? objE : objX;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super ax.a> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(this.f169132p, this.f169133q, this.f169134r, this.f169135s, this.f169136t, eVar);
        }
    }

    public a(u uVar, t tVar, d dVar) {
        this.keyguardManager = uVar;
        this.keyStoreProvider = tVar;
        this.remoteLogger = dVar;
    }

    private final FingerprintManager k() {
        p pVar = this.activity;
        FingerprintManager fingerprintManager = null;
        Object systemService = pVar != null ? pVar.getSystemService("fingerprint") : null;
        FingerprintManager fingerprintManager2 = systemService instanceof FingerprintManager ? (FingerprintManager) systemService : null;
        if (fingerprintManager2 == null) {
            p pVar2 = this.activity;
            if (pVar2 != null) {
                fingerprintManager = (FingerprintManager) pVar2.getSystemService(FingerprintManager.class);
            }
        } else {
            fingerprintManager = fingerprintManager2;
        }
        if (fingerprintManager == null) {
            this.remoteLogger.F8("FingerprintManager is null", d.a.ERROR);
        }
        return fingerprintManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b n(int code, String errString) {
        switch (code) {
            case 1:
                return dx.b.InterfaceC1027b.a.C1028a.f45022a;
            case 2:
                return dx.e.f45094a;
            case 3:
            case 5:
            case 6:
            case 10:
            case 13:
            default:
                this.remoteLogger.F8("Biometric unknown errorCode: " + code, d.a.ERROR);
                return new dx.b.InterfaceC1027b.a.UnknownError(code, null, 2, null);
            case 4:
                return h.f45097a;
            case 7:
                return dx.c.f45092a;
            case 8:
                return new Vendor(fu.r.t0(errString) ? Label.INSTANCE.c() : mx.b.b(errString, "biometric_manager_default_error_tag"));
            case 9:
                return dx.d.f45093a;
            case 11:
                return dx.b.InterfaceC1027b.a.c.f45024a;
            case 12:
                return dx.b.InterfaceC1027b.a.C1029b.f45023a;
            case 14:
                return dx.b.j.a.f45086a;
            case 15:
                return dx.b.j.e.f45089a;
        }
    }

    private final int o(ax.d dVar) {
        int i15 = C4273a.f169122a[dVar.ordinal()];
        if (i15 == 1) {
            return 15;
        }
        if (i15 == 2) {
            return GF2Field.MASK;
        }
        if (i15 == 3) {
            return 32768;
        }
        throw new oq.p();
    }

    private final i<dx.b, i0> p(String alias) {
        i<dx.b, i0> iVarA = t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null);
        if (iVarA instanceof i.Left) {
            return iVarA;
        }
        if (!(iVarA instanceof i.Right)) {
            throw new oq.p();
        }
        try {
            Key key = ((KeyStore) ((i.Right) iVarA).b()).getKey(alias, null);
            if ((key instanceof SecretKey ? (SecretKey) key : null) != null) {
                return new i.Right(i0.f148189a);
            }
            this.remoteLogger.F8("verifyBiometricPresence error: null key", d.a.ERROR);
            return new i.Left(dx.b.j.c.f45087a);
        } catch (KeyStoreException e15) {
            return new i.Left(new dx.b.Generic(e15));
        } catch (NoSuchAlgorithmException e16) {
            return new i.Left(new dx.b.Generic(e16));
        } catch (UnrecoverableKeyException unused) {
            this.remoteLogger.F8("verifyBiometricPresence error: unrecoverable key", d.a.ERROR);
            return new i.Left(dx.b.j.c.f45087a);
        }
    }

    @Override // ax.e
    public Object a(c cVar, BiometricAuthLabels biometricAuthLabels, boolean z15, List<? extends ax.d> list, er.p<? super Integer, ? super tq.e<? super Boolean>, ? extends Object> pVar, tq.e<? super ax.a> eVar) {
        int i15;
        this.remoteLogger.F8("Biometric authenticate:\n-mode: " + cVar + "\n-confirmation: " + z15 + "\n-strength: " + list, d.a.GENERAL);
        p pVar2 = this.activity;
        if (pVar2 == null) {
            return new ax.a.Error(new dx.b.InterfaceC1027b.a.UnknownError(0, new NullPointerException("Activity is null"), 1, null));
        }
        m1.d.a aVarC = new m1.d.a().g(biometricAuthLabels.getTitle().getText()).f(biometricAuthLabels.getSubtitle().getText()).d(biometricAuthLabels.getDescription().getText()).c(z15);
        List<? extends ax.d> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i16 = C4273a.f169122a[((ax.d) it.next()).ordinal()];
            if (i16 == 1) {
                i15 = 15;
            } else if (i16 == 2) {
                i15 = GF2Field.MASK;
            } else {
                if (i16 != 3) {
                    throw new oq.p();
                }
                i15 = 32768;
            }
            arrayList.add(vq.b.e(i15));
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = vq.b.e(((Number) next).intValue() | ((Number) it4.next()).intValue());
        }
        m1.d.a aVarB = aVarC.b(((Number) next).intValue());
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                if (v.q(ax.d.STRONG, ax.d.WEAK).contains((ax.d) it5.next())) {
                    aVarB.e(biometricAuthLabels.getNegativeButton().getText());
                    break;
                }
            }
        }
        return ju.i.g(g1.c(), new b(pVar2, aVarB, cVar, new n0(), pVar, null), eVar);
    }

    @Override // ax.e
    public Integer c(List<? extends ax.d> strength) {
        l1 l1Var = this.biometricManager;
        if (l1Var == null) {
            return null;
        }
        List<? extends ax.d> list = strength;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(o((ax.d) it.next())));
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it4.next()).intValue());
        }
        return Integer.valueOf(l1Var.a(((Number) next).intValue()));
    }

    @Override // ax.e
    public i<dx.b, i0> d(List<? extends ax.d> strength, String keyAlias) {
        i<dx.b, i0> left;
        Integer numC = c(strength);
        if (numC != null) {
            int iIntValue = numC.intValue();
            if (iIntValue == -2) {
                left = new i.Left<>(dx.b.InterfaceC1027b.a.f.f45028a);
            } else if (iIntValue == -1) {
                left = !l() ? new i.Left(dx.b.InterfaceC1027b.a.c.f45024a) : new i.Left(dx.b.InterfaceC1027b.a.d.f45025a);
            } else if (iIntValue != 0) {
                if (iIntValue == 1) {
                    left = new i.Left<>(dx.b.InterfaceC1027b.a.C1028a.f45022a);
                } else if (iIntValue == 11) {
                    left = new i.Left<>(dx.b.InterfaceC1027b.a.c.f45024a);
                } else if (iIntValue != 12) {
                    left = iIntValue != 15 ? new i.Left<>(n(iIntValue, "")) : new i.Left<>(dx.b.j.e.f45089a);
                } else {
                    left = new i.Left<>(dx.b.InterfaceC1027b.a.C1029b.f45023a);
                }
            } else if (!this.keyguardManager.a()) {
                left = new i.Left<>(dx.b.j.a.f45086a);
            } else if (!m()) {
                left = new i.Left<>(dx.b.InterfaceC1027b.a.C1029b.f45023a);
            } else if (l()) {
                left = fu.r.t0(keyAlias) ? new i.Right<>(i0.f148189a) : p(keyAlias);
            } else {
                left = new i.Left<>(dx.b.InterfaceC1027b.a.c.f45024a);
            }
            if (left != null) {
                return left;
            }
        }
        this.remoteLogger.F8("Biometric canAuthenticate, manager is null", d.a.ERROR);
        return new i.Left(new dx.b.InterfaceC1027b.a.UnknownError(0, new NullPointerException("BiometricManager is null"), 1, null));
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.activity = activity instanceof p ? (p) activity : null;
        this.biometricManager = l1.g(activity);
    }

    public void j() {
        f.f163100a.b("cancelAuthentication", px.c.a(this));
        m1 m1Var = this.biometricPrompt;
        if (m1Var != null) {
            m1Var.d();
        }
    }

    public boolean l() {
        FingerprintManager fingerprintManagerK = k();
        if (fingerprintManagerK != null) {
            return fingerprintManagerK.hasEnrolledFingerprints();
        }
        return false;
    }

    public boolean m() {
        FingerprintManager fingerprintManagerK = k();
        if (fingerprintManagerK != null) {
            return fingerprintManagerK.isHardwareDetected();
        }
        return false;
    }
}
