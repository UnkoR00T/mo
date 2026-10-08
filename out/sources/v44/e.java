package v44;

import android.content.Context;
import ay.j;
import com.google.gson.u;
import fr.q0;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.List;
import mu.b0;
import mu.g;
import mu.r0;
import oq.p;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import u44.GooglePayTokenModelEntity;
import vh.l;
import yh.i;
import yh.n;
import yh.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u00013B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b%\u0010!J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020.2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010:R\u0014\u0010<\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010;R\"\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190>0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010CR\u001c\u0010G\u001a\n E*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010F¨\u0006I"}, d2 = {"Lv44/e;", "Lv44/b;", "Lx44/b;", "Landroid/content/Context;", "applicationContext", "Lay/j;", "jsonSerializer", "Ly04/a;", "buildConfigRepository", "<init>", "(Landroid/content/Context;Lay/j;Ly04/a;)V", "Ljava/math/BigDecimal;", "", "j", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "priceLabel", "gateway", "gatewayMerchantId", "merchantName", "Lorg/json/JSONObject;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "price", "m", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lyh/i;", "paymentData", "Ldx/i;", "Ldx/b;", "Lq44/a$f;", "i", "(Lyh/i;)Ldx/i;", "f", "()Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "k", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;", "n", "context", "Lyh/n;", "h", "(Landroid/content/Context;)Lyh/n;", "", "c", "(Ltq/e;)Ljava/lang/Object;", "totalAmount", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "Lmu/g;", "Lq44/a;", "a", "()Lmu/g;", "LCON/p;", "activity", "e", "(LCON/p;)V", "Lay/j;", "Ly04/a;", "Lyh/n;", "paymentsClient", "LNUl/e;", "Lvh/l;", "d", "LNUl/e;", "launcher", "Lmu/b0;", "Lmu/b0;", "paymentStatus", "kotlin.jvm.PlatformType", "Lorg/json/JSONObject;", "baseRequest", "g", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements v44.b, x44.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f203940h = v.q("MASTERCARD", "VISA");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<String> f203941j = v.q("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n paymentsClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p006NUl.e<l<i>> launcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<q44.a> paymentStatus = r0.a(q44.a.d.f164732a);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final JSONObject baseRequest = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f203948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f203949e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203951g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f203949e = obj;
            this.f203951g |= PKIFailureInfo.systemUnavail;
            return e.this.c(this);
        }
    }

    public e(Context context, j jVar, y04.a aVar) {
        this.jsonSerializer = jVar;
        this.buildConfigRepository = aVar;
        this.paymentsClient = h(context);
    }

    private final JSONObject f() {
        return new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f203941j)).put("allowedCardNetworks", new JSONArray((Collection) f203940h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e eVar, ai.a aVar) {
        q44.a success;
        b0<q44.a> b0Var = eVar.paymentStatus;
        int iP = aVar.b().p();
        if (iP != 0) {
            success = (iP == 10 || iP != 16) ? q44.a.b.f164729a : q44.a.C4092a.f164728a;
        } else {
            dx.i<dx.b, q44.a.Token> iVarI = eVar.i((i) aVar.a());
            if (iVarI instanceof dx.i.Left) {
                success = q44.a.b.f164729a;
            } else {
                if (!(iVarI instanceof dx.i.Right)) {
                    throw new p();
                }
                success = new q44.a.Success((q44.a.Token) ((dx.i.Right) iVarI).b());
            }
        }
        b0Var.f(success);
    }

    private final n h(Context context) {
        r.a.C6086a c6086a = new r.a.C6086a();
        boolean googlePayTestEnv = this.buildConfigRepository.getGooglePayTestEnv();
        int i15 = 1;
        if (googlePayTestEnv) {
            i15 = 3;
        } else if (googlePayTestEnv) {
            throw new p();
        }
        return r.a(context, c6086a.b(i15).a());
    }

    private final dx.i<dx.b, q44.a.Token> i(i paymentData) {
        String strM;
        if (paymentData == null || (strM = paymentData.m()) == null) {
            return new dx.i.Left(new dx.b.Parsing(null, 1, null));
        }
        try {
            return new dx.i.Right(t44.a.b((GooglePayTokenModelEntity) this.jsonSerializer.a(new JSONObject(strM).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"), q0.n(GooglePayTokenModelEntity.class))));
        } catch (u e15) {
            return new dx.i.Left(new dx.b.Parsing(e15));
        } catch (JSONException e16) {
            return new dx.i.Left(new dx.b.Parsing(e16));
        }
    }

    private final String j(BigDecimal bigDecimal) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        return new DecimalFormat("#.##", decimalFormatSymbols).format(bigDecimal);
    }

    private final JSONArray k(String gateway, String gatewayMerchantId) {
        return new JSONArray().put(f().put("tokenizationSpecification", new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject(v0.l(y.a("gateway", gateway), y.a("gatewayMerchantId", gatewayMerchantId))))));
    }

    private final JSONObject l(String priceLabel, String gateway, String gatewayMerchantId, String merchantName) {
        return this.baseRequest.put("allowedPaymentMethods", k(gateway, gatewayMerchantId)).put("transactionInfo", m(priceLabel)).put("merchantInfo", new JSONObject().put("merchantName", merchantName));
    }

    private final JSONObject m(String price) {
        return new JSONObject().put("totalPrice", price).put("totalPriceStatus", "FINAL").put("countryCode", "PL").put("currencyCode", "PLN");
    }

    private final JSONObject n() {
        try {
            return this.baseRequest.put("allowedPaymentMethods", new JSONArray().put(f()));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // x44.b
    public g<q44.a> a() {
        return this.paymentStatus;
    }

    @Override // x44.b
    public void b(String gateway, String gatewayMerchantId, BigDecimal totalAmount, String merchantName) {
        this.paymentStatus.f(q44.a.d.f164732a);
        l<i> lVarE = this.paymentsClient.E(yh.j.h(l(j(totalAmount), gateway, gatewayMerchantId, merchantName).toString()));
        final p006NUl.e<l<i>> eVar = this.launcher;
        if (eVar == null) {
            eVar = null;
        }
        lVarE.c(new vh.f() { // from class: v44.c
            @Override // vh.f
            public final void a(l lVar) {
                eVar.a(lVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x44.b
    public Object c(tq.e<? super Boolean> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f203951g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f203951g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f203949e;
        Object objE = uq.b.e();
        int i16 = bVar.f203951g;
        if (i16 == 0) {
            oq.u.b(objA);
            yh.e eVarH = yh.e.h(String.valueOf(n()));
            l<Boolean> lVarD = this.paymentsClient.D(eVarH);
            bVar.f203948d = vq.j.a(eVarH);
            bVar.f203951g = 1;
            objA = tu.b.a(lVarD, bVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        return objA;
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.launcher = activity.p0(new ai.c(), new p006NUl.d() { // from class: v44.d
            @Override // p006NUl.d
            public final void a(Object obj) {
                e.g(this.f203938a, (ai.a) obj);
            }
        });
    }
}
