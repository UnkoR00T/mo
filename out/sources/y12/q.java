package y12;

import d12.OAuthWebViewData;
import eo0.CountryDictionary;
import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k10.c0;
import m02.Field;
import m02.SearchModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BY\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010#\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)JA\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00104JA\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002050,2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b6\u00104JA\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002070,2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b8\u00104J1\u0010;\u001a\b\u0012\u0004\u0012\u0002050,2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\b;\u0010<J1\u0010>\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020=0,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\b>\u0010<J1\u0010@\u001a\b\u0012\u0004\u0012\u0002070,2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020?0,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\b@\u0010<J%\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020A2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u0004\u0018\u00010F2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010g\u001a\b\u0012\u0004\u0012\u00020b0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR&\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030h8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR \u0010+\u001a\b\u0012\u0004\u0012\u00020I0n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006s"}, d2 = {"Ly12/q;", "Ll00/g;", "Ly12/b;", "Ly12/a;", "Ly12/c;", "", "Lyy/a;", "stateMachineFactory", "La22/p;", "mapper", "Lt02/w;", "validateIdentifierUC", "Lt02/j;", "validateAddressUC", "Lt02/y;", "validateNamesUC", "Lp02/o;", "getCountriesDictionaryUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lb12/c;", "errorMapper", "La22/s;", "searchCountryMapper", "Lp02/m;", "getAdvancedSearchRequestUC", "<init>", "(Lyy/a;La22/p;Lt02/w;Lt02/j;Lt02/y;Lp02/o;Lac4/a;Lb12/c;La22/s;Lp02/m;)V", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRefreshToken", "onRetry", "onBack", "J9", "(Ldx/b;Ler/a;Ler/a;Ler/a;)V", "Lf02/a;", "recipientType", "Lm02/b;", "P9", "(Lf02/a;)Lm02/b;", "Lk10/c0;", "state", "", "Lt02/w$b$a;", "params", "", "shouldScroll", "shouldGoToSearch", "Lk10/l;", "X9", "(Lk10/c0;Ljava/util/Set;ZZ)Lk10/l;", "Lt02/j$a$a;", "T9", "Lt02/y$a$a;", "V9", "Lm02/a$a;", "fields", "E9", "(Ljava/util/Set;Lk10/c0;)Ljava/util/Set;", "Lm02/a$c;", "I9", "Lm02/a$d;", "F9", "Lm02/a;", "fieldType", "", "H9", "(Lm02/a;Lk10/c0;)Ljava/lang/String;", "Leo0/l;", "G9", "(Lk10/c0;)Leo0/l;", "Ly12/c$a;", "L9", "(Ly12/b;)Ly12/c$a;", "b", "La22/p;", "c", "Lt02/w;", "d", "Lt02/j;", "e", "Lt02/y;", "f", "Lp02/o;", "g", "Lac4/a;", "h", "Lb12/c;", "j", "La22/s;", "k", "Lp02/m;", "l", "Ly12/b;", "initialState", "Lxw/b;", "Ly12/a$f;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, y12.a> implements y12.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a22.p mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t02.w validateIdentifierUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t02.j validateAddressUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t02.y validateNamesUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p02.o getCountriesDictionaryUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b12.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a22.s searchCountryMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p02.m getAdvancedSearchRequestUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y12.a.f> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, y12.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<y12.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f223258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f223259c;

        static {
            int[] iArr = new int[m02.a.EnumC2987a.values().length];
            try {
                iArr[m02.a.EnumC2987a.PUBLIC_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m02.a.EnumC2987a.CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m02.a.EnumC2987a.BUILDING_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m02.a.EnumC2987a.APARTMENT_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m02.a.EnumC2987a.STREET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m02.a.EnumC2987a.POSTCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m02.a.EnumC2987a.COUNTRY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m02.a.EnumC2987a.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m02.a.EnumC2987a.SURNAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f223257a = iArr;
            int[] iArr2 = new int[m02.a.c.values().length];
            try {
                iArr2[m02.a.c.PESEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[m02.a.c.NIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[m02.a.c.REGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[m02.a.c.KRS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[m02.a.c.EUROPEAN_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f223258b = iArr2;
            int[] iArr3 = new int[m02.a.d.values().length];
            try {
                iArr3[m02.a.d.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[m02.a.d.SURNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            f223259c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<y12.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f223260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f223261b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f223262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f223263b;

            /* JADX INFO: renamed from: y12.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5964a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f223264d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f223265e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f223266f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f223268h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f223269j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f223270k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f223271l;

                public C5964a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f223264d = obj;
                    this.f223265e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f223262a = hVar;
                this.f223263b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5964a c5964a;
                if (eVar instanceof C5964a) {
                    c5964a = (C5964a) eVar;
                    int i15 = c5964a.f223265e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5964a.f223265e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5964a = new C5964a(eVar);
                    }
                } else {
                    c5964a = new C5964a(eVar);
                }
                Object obj2 = c5964a.f223264d;
                Object objE = uq.b.e();
                int i16 = c5964a.f223265e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f223262a;
                    y12.c.Data dataL9 = this.f223263b.L9((State) obj);
                    c5964a.f223266f = vq.j.a(obj);
                    c5964a.f223268h = vq.j.a(c5964a);
                    c5964a.f223269j = vq.j.a(obj);
                    c5964a.f223270k = vq.j.a(hVar);
                    c5964a.f223271l = 0;
                    c5964a.f223265e = 1;
                    if (hVar.F(dataL9, c5964a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, q qVar) {
            this.f223260a = gVar;
            this.f223261b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super y12.c.Data> hVar, tq.e eVar) {
            Object objA = this.f223260a.a(new a(hVar, this.f223261b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$m;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<y12.a.ValidateBailiffNames, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223274g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.ValidateBailiffNames validateBailiffNames = (y12.a.ValidateBailiffNames) this.f223273f;
            c0 c0Var = (c0) this.f223274g;
            uq.b.e();
            if (this.f223272e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return q.this.V9(c0Var, q.this.F9(validateBailiffNames.a(), c0Var), validateBailiffNames.getShouldScrollToField(), validateBailiffNames.getShouldGoToSearch());
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.ValidateBailiffNames validateBailiffNames, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f223273f = validateBailiffNames;
            cVar.f223274g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$n;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<y12.a.ValidateIdentifier, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223278g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.ValidateIdentifier validateIdentifier = (y12.a.ValidateIdentifier) this.f223277f;
            c0 c0Var = (c0) this.f223278g;
            uq.b.e();
            if (this.f223276e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return q.this.X9(c0Var, q.this.I9(validateIdentifier.a(), c0Var), validateIdentifier.getShouldScrollToField(), validateIdentifier.getShouldGoToSearch());
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.ValidateIdentifier validateIdentifier, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f223277f = validateIdentifier;
            dVar.f223278g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly12/a$h;", "<unused var>", "Ly12/b;", "state", "Loq/i0;", "<anonymous>", "(Ly12/a$h;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<y12.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223281f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f223281f;
            Object objE = uq.b.e();
            int i15 = this.f223280e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y12.a.f> bVarY1 = q.this.Y1();
                y12.a.f.GoToResults goToResults = new y12.a.f.GoToResults(q.this.getAdvancedSearchRequestUC.d(new p02.m.Params(state.getFields(), state.getSearchCondition(), state.c())));
                this.f223281f = vq.j.a(state);
                this.f223280e = 1;
                if (bVarY1.F(goToResults, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.h hVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f223281f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly12/a$e;", "action", "Ly12/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly12/a$e;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<y12.a.GoToAuthorization, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223284f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q qVar, y12.a.GoToAuthorization goToAuthorization) {
            qVar.d9(goToAuthorization.getAction());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y12.a.GoToAuthorization goToAuthorization = (y12.a.GoToAuthorization) this.f223284f;
            Object objE = uq.b.e();
            int i15 = this.f223283e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y12.a.f> bVarY1 = q.this.Y1();
                final q qVar = q.this;
                y12.a.f.GoToAuthorization goToAuthorization2 = new y12.a.f.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: y12.r
                    @Override // er.a
                    public final Object a() {
                        return q.f.O(qVar, goToAuthorization);
                    }
                }));
                this.f223284f = vq.j.a(goToAuthorization);
                this.f223283e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.GoToAuthorization goToAuthorization, State state, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f223284f = goToAuthorization;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$j;", "<unused var>", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<y12.a.j, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223287f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ly12/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f223289e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f223290f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f223291g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f223292h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f223293j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f223294k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f223295l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f223296m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ q f223297n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0<State> f223298p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f223297n = qVar;
                this.f223298p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 X(q qVar, CountryDictionary countryDictionary) {
                qVar.d9(new y12.a.ValueChanged(oq.y.a(m02.a.EnumC2987a.COUNTRY, countryDictionary.getName())));
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State Y(List list, State state) {
                return State.b(state, null, null, null, list, 7, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<State> c0Var;
                final List list;
                Object objE = uq.b.e();
                int i15 = this.f223296m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.o oVar = this.f223297n.getCountriesDictionaryUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f223296m = 1;
                    obj = oVar.a(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f223291g;
                    c0Var = (c0) this.f223290f;
                    oq.u.b(obj);
                }
                i0 i0Var = i0.f148189a;
                return c0Var.b(new er.l() { // from class: y12.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.g.a.Y(list, (State) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                final q qVar = this.f223297n;
                c0<State> c0Var2 = this.f223298p;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    y12.a.j jVar = y12.a.j.f223175a;
                    qVar.J9(bVar, qVar.b9(new y12.a.GoToAuthorization(jVar)), qVar.b9(jVar), qVar.b9(y12.a.C5959a.f223162a));
                    return c0Var2.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                List list2 = (List) ((dx.i.Right) iVar).b();
                a22.s sVar = qVar.searchCountryMapper;
                Field<String> field = c0Var2.a().getFields().a().get(m02.a.EnumC2987a.COUNTRY);
                SearchModel searchModelB = sVar.b(new a22.s.Params(field != null ? field.d() : null, list2, new er.l() { // from class: y12.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.g.a.X(qVar, (CountryDictionary) obj2);
                    }
                }));
                xw.b<y12.a.f> bVarY1 = qVar.Y1();
                y12.a.f.ShowCountriesDictionary showCountriesDictionary = new y12.a.f.ShowCountriesDictionary(searchModelB);
                this.f223289e = vq.j.a(iVar);
                this.f223290f = c0Var2;
                this.f223291g = list2;
                this.f223292h = vq.j.a(searchModelB);
                this.f223293j = 0;
                this.f223294k = 0;
                this.f223295l = 0;
                this.f223296m = 2;
                if (bVarY1.F(showCountriesDictionary, this) != objE) {
                    c0Var = c0Var2;
                    list = list2;
                    i0 i0Var2 = i0.f148189a;
                    return c0Var.b(new er.l() { // from class: y12.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.g.a.Y(list, (State) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f223297n, this.f223298p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f223287f;
            Object objE = uq.b.e();
            int i15 = this.f223286e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f223287f = vq.j.a(c0Var);
            this.f223286e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.j jVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f223287f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly12/a$a;", "<unused var>", "Ly12/b;", "Loq/i0;", "<anonymous>", "(Ly12/a$a;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<y12.a.C5959a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223299e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f223299e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y12.a.f> bVarY1 = q.this.Y1();
                y12.a.f.C5960a c5960a = y12.a.f.C5960a.f223167a;
                this.f223299e = 1;
                if (bVarY1.F(c5960a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.C5959a c5959a, State state, tq.e<? super i0> eVar) {
            return q.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly12/a$b;", "action", "Ly12/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly12/a$b;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<y12.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223302f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.Error error = (y12.a.Error) this.f223302f;
            Object objE = uq.b.e();
            int i15 = this.f223301e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y12.a.f> bVarY1 = q.this.Y1();
                y12.a.f.Error error2 = new y12.a.f.Error(error.getError());
                this.f223302f = vq.j.a(error);
                this.f223301e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.Error error, State state, tq.e<? super i0> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f223302f = error;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$i;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<y12.a.SearchConditionSelected, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223306g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(y12.a.SearchConditionSelected searchConditionSelected, q qVar, State state) {
            return State.b(state, searchConditionSelected.getSearchCondition(), qVar.P9(searchConditionSelected.getSearchCondition()), null, pq.v.e(CountryDictionary.INSTANCE.a()), 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y12.a.SearchConditionSelected searchConditionSelected = (y12.a.SearchConditionSelected) this.f223305f;
            c0 c0Var = (c0) this.f223306g;
            uq.b.e();
            if (this.f223304e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: y12.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O(searchConditionSelected, qVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.SearchConditionSelected searchConditionSelected, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = q.this.new j(eVar);
            jVar.f223305f = searchConditionSelected;
            jVar.f223306g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$g;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<y12.a.RecipientTypeSelected, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223310g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(q qVar, y12.a.RecipientTypeSelected recipientTypeSelected, State state) {
            return State.b(state, recipientTypeSelected.getRecipientSearchCondition(), qVar.P9(recipientTypeSelected.getRecipientSearchCondition()), null, pq.v.e(CountryDictionary.INSTANCE.a()), 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y12.a.RecipientTypeSelected recipientTypeSelected = (y12.a.RecipientTypeSelected) this.f223309f;
            c0 c0Var = (c0) this.f223310g;
            uq.b.e();
            if (this.f223308e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: y12.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O(qVar, recipientTypeSelected, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.RecipientTypeSelected recipientTypeSelected, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = q.this.new k(eVar);
            kVar.f223309f = recipientTypeSelected;
            kVar.f223310g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$o;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<y12.a.ValueChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223314g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(m02.a aVar, String str, State state) {
            m02.b bVarB;
            m02.b fields = state.getFields();
            if (fields instanceof m02.b.PublicIdentifier) {
                bVarB = ((m02.b.PublicIdentifier) fields).b(V(fields, aVar, str));
            } else if (fields instanceof m02.b.PublicAddress) {
                bVarB = ((m02.b.PublicAddress) fields).b(V(fields, aVar, str));
            } else if (fields instanceof m02.b.BailiffAddress) {
                bVarB = ((m02.b.BailiffAddress) fields).b(V(fields, aVar, str));
            } else if (fields instanceof m02.b.BailiffIdentifier) {
                bVarB = ((m02.b.BailiffIdentifier) fields).b(V(fields, aVar, str));
            } else {
                if (!(fields instanceof m02.b.BailiffNames)) {
                    throw new oq.p();
                }
                bVarB = ((m02.b.BailiffNames) fields).b(V(fields, aVar, str));
            }
            return State.b(state, null, bVarB, null, null, 13, null);
        }

        private static final Map<m02.a, Field<String>> V(m02.b bVar, m02.a aVar, String str) {
            Map<m02.a, Field<String>> mapW = v0.w(bVar.a());
            mapW.put(aVar, new Field<>(str, null, 2, null));
            return mapW;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.ValueChanged valueChanged = (y12.a.ValueChanged) this.f223313f;
            c0 c0Var = (c0) this.f223314g;
            uq.b.e();
            if (this.f223312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            oq.r<m02.a, String> rVarA = valueChanged.a();
            final m02.a aVarA = rVarA.a();
            final String strB = rVarA.b();
            return c0Var.b(new er.l() { // from class: y12.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.l.O(aVarA, strB, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.ValueChanged valueChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f223313f = valueChanged;
            lVar.f223314g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly12/a$d;", "action", "Ly12/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly12/a$d;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<y12.a.FocusChanged, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223316f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.FocusChanged focusChanged = (y12.a.FocusChanged) this.f223316f;
            uq.b.e();
            if (this.f223315e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m02.a focusedField = focusChanged.getFocusedField();
            if (focusedField instanceof m02.a.EnumC2987a) {
                q.this.d9(new y12.a.ValidateAddress(e1.d(focusChanged.getFocusedField()), false, false, 6, null));
            } else if (focusedField instanceof m02.a.c) {
                q.this.d9(new y12.a.ValidateIdentifier(e1.d(focusChanged.getFocusedField()), false, false, 6, null));
            } else {
                if (!(focusedField instanceof m02.a.d)) {
                    throw new oq.p();
                }
                q.this.d9(new y12.a.ValidateBailiffNames(e1.d(focusChanged.getFocusedField()), false, false, 6, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.FocusChanged focusChanged, State state, tq.e<? super i0> eVar) {
            m mVar = q.this.new m(eVar);
            mVar.f223316f = focusChanged;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly12/a$k;", "<unused var>", "Ly12/b;", "state", "Loq/i0;", "<anonymous>", "(Ly12/a$k;Ly12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<y12.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223319f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f223319f;
            uq.b.e();
            if (this.f223318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f02.a searchCondition = state.getSearchCondition();
            if (fr.t.c(searchCondition, f02.a.AbstractC1288a.b.f54575a)) {
                q.this.d9(new y12.a.ValidateIdentifier(m02.a.INSTANCE.b(), true, true));
            } else if (fr.t.c(searchCondition, f02.a.AbstractC1288a.C1289a.f54574a)) {
                q.this.d9(new y12.a.ValidateAddress(m02.a.INSTANCE.a(), true, true));
            } else if (fr.t.c(searchCondition, f02.a.AbstractC1288a.c.f54576a)) {
                q.this.d9(new y12.a.ValidateBailiffNames(m02.a.INSTANCE.c(), true, true));
            } else if (fr.t.c(searchCondition, f02.a.b.C1291b.f54578a)) {
                q.this.d9(new y12.a.ValidateIdentifier(m02.a.INSTANCE.e(), true, true));
            } else {
                if (!fr.t.c(searchCondition, f02.a.b.C1290a.f54577a)) {
                    throw new oq.p();
                }
                q.this.d9(new y12.a.ValidateAddress(m02.a.INSTANCE.d(), true, true));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.k kVar, State state, tq.e<? super i0> eVar) {
            n nVar = q.this.new n(eVar);
            nVar.f223319f = state;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$c;", "<unused var>", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<y12.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223322f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f223322f;
            uq.b.e();
            if (this.f223321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: y12.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.o.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f223322f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly12/a$l;", "action", "Lk10/c0;", "Ly12/b;", "state", "Lk10/l;", "<anonymous>", "(Ly12/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<y12.a.ValidateAddress, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f223325g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y12.a.ValidateAddress validateAddress = (y12.a.ValidateAddress) this.f223324f;
            c0 c0Var = (c0) this.f223325g;
            uq.b.e();
            if (this.f223323e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return q.this.T9(c0Var, q.this.E9(validateAddress.a(), c0Var), validateAddress.getShouldScrollToField(), validateAddress.getShouldGoToSearch());
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y12.a.ValidateAddress validateAddress, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = q.this.new p(eVar);
            pVar.f223324f = validateAddress;
            pVar.f223325g = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, a22.p pVar, t02.w wVar, t02.j jVar, t02.y yVar, p02.o oVar, ac4.a aVar2, b12.c cVar, a22.s sVar, p02.m mVar) {
        this.mapper = pVar;
        this.validateIdentifierUC = wVar;
        this.validateAddressUC = jVar;
        this.validateNamesUC = yVar;
        this.getCountriesDictionaryUC = oVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorMapper = cVar;
        this.searchCountryMapper = sVar;
        this.getAdvancedSearchRequestUC = mVar;
        State state = new State(null, new m02.b.PublicIdentifier(null, 1, null), null, null, 13, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: y12.h
            @Override // er.l
            public final Object b(Object obj) {
                return q.R9(this.f223231a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), L9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<t02.j.Params.InterfaceC4838a> E9(Set<? extends m02.a.EnumC2987a> fields, c0<State> state) {
        t02.j.Params.InterfaceC4838a gVar;
        Set<? extends m02.a.EnumC2987a> set = fields;
        ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
        for (m02.a.EnumC2987a enumC2987a : set) {
            switch (a.f223257a[enumC2987a.ordinal()]) {
                case 1:
                    gVar = new t02.j.Params.InterfaceC4838a.g(H9(enumC2987a, state));
                    break;
                case 2:
                    gVar = new t02.j.Params.InterfaceC4838a.c(H9(enumC2987a, state));
                    break;
                case 3:
                    gVar = new t02.j.Params.InterfaceC4838a.b(H9(enumC2987a, state));
                    break;
                case 4:
                    gVar = new t02.j.Params.InterfaceC4838a.C4839a(H9(enumC2987a, state));
                    break;
                case 5:
                    gVar = new t02.j.Params.InterfaceC4838a.h(H9(enumC2987a, state));
                    break;
                case 6:
                    gVar = new t02.j.Params.InterfaceC4838a.f(H9(enumC2987a, state), G9(state));
                    break;
                case 7:
                    gVar = new t02.j.Params.InterfaceC4838a.d(H9(enumC2987a, state));
                    break;
                case 8:
                    gVar = new t02.j.Params.InterfaceC4838a.e(H9(enumC2987a, state));
                    break;
                case 9:
                    gVar = new t02.j.Params.InterfaceC4838a.i(H9(enumC2987a, state));
                    break;
                default:
                    throw new oq.p();
            }
            arrayList.add(gVar);
        }
        return pq.v.k1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<t02.y.Params.InterfaceC4846a> F9(Set<? extends m02.a.d> fields, c0<State> state) {
        t02.y.Params.InterfaceC4846a c4847a;
        Set<? extends m02.a.d> set = fields;
        ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
        for (m02.a.d dVar : set) {
            int i15 = a.f223259c[dVar.ordinal()];
            if (i15 == 1) {
                c4847a = new t02.y.Params.InterfaceC4846a.C4847a(H9(dVar, state));
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                c4847a = new t02.y.Params.InterfaceC4846a.b(H9(dVar, state));
            }
            arrayList.add(c4847a);
        }
        return pq.v.k1(arrayList);
    }

    private final CountryDictionary G9(c0<State> state) {
        String str;
        Object next;
        String name;
        Field<String> field;
        Iterator<T> it = state.a().c().iterator();
        do {
            str = null;
            if (it.hasNext()) {
                next = it.next();
                name = ((CountryDictionary) next).getName();
                field = state.a().getFields().a().get(m02.a.EnumC2987a.COUNTRY);
            }
            return (CountryDictionary) str;
        } while (!fr.t.c(name, field != null ? field.d() : null));
        str = next;
        return (CountryDictionary) str;
    }

    private final String H9(m02.a fieldType, c0<State> state) {
        String strD;
        Field<String> field = state.a().getFields().a().get(fieldType);
        return (field == null || (strD = field.d()) == null) ? "" : strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<t02.w.Params.a> I9(Set<? extends m02.a.c> fields, c0<State> state) {
        t02.w.Params.a pesel;
        Set<? extends m02.a.c> set = fields;
        ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
        for (m02.a.c cVar : set) {
            int i15 = a.f223258b[cVar.ordinal()];
            if (i15 == 1) {
                pesel = new t02.w.Params.a.Pesel(H9(cVar, state));
            } else if (i15 == 2) {
                pesel = new t02.w.Params.a.Nip(H9(cVar, state));
            } else if (i15 == 3) {
                pesel = new t02.w.Params.a.Regon(H9(cVar, state));
            } else if (i15 == 4) {
                pesel = new t02.w.Params.a.Krs(H9(cVar, state));
            } else {
                if (i15 != 5) {
                    throw new oq.p();
                }
                pesel = new t02.w.Params.a.EuropeanId(H9(cVar, state));
            }
            arrayList.add(pesel);
        }
        return pq.v.k1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(dx.b domainError, er.a<i0> onRefreshToken, er.a<i0> onRetry, er.a<i0> onBack) {
        this.errorMapper.c(new b12.c.Params(domainError, onRefreshToken, onBack, onRetry, new er.l() { // from class: y12.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.K9((jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(jb4.b bVar) {
        new y12.a.Error(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y12.c.Data L9(State state) {
        return this.mapper.b(new a22.p.Params(state, b9(y12.a.C5959a.f223162a), new er.l() { // from class: y12.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.M9(this.f223233a, (f02.a) obj);
            }
        }, new er.l() { // from class: y12.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.N9(this.f223234a, (oq.r) obj);
            }
        }, b9(y12.a.k.f223176a), new er.l() { // from class: y12.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.O9(this.f223235a, (m02.a) obj);
            }
        }, b9(y12.a.c.f223164a), b9(y12.a.j.f223175a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(q qVar, f02.a aVar) {
        qVar.d9(new y12.a.SearchConditionSelected(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(q qVar, oq.r rVar) {
        qVar.d9(new y12.a.ValueChanged(rVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(q qVar, m02.a aVar) {
        qVar.d9(new y12.a.FocusChanged(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m02.b P9(f02.a recipientType) {
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.b.f54575a)) {
            return new m02.b.BailiffIdentifier(null, 1, null);
        }
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.C1289a.f54574a)) {
            return new m02.b.BailiffAddress(null, 1, null);
        }
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.c.f54576a)) {
            return new m02.b.BailiffNames(null, 1, null);
        }
        if (fr.t.c(recipientType, f02.a.b.C1291b.f54578a)) {
            return new m02.b.PublicIdentifier(null, 1, null);
        }
        if (fr.t.c(recipientType, f02.a.b.C1290a.f54577a)) {
            return new m02.b.PublicAddress(null, 1, null);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: y12.i
            @Override // er.l
            public final Object b(Object obj) {
                return q.S9(this.f223232a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(q qVar, k10.z zVar) {
        h hVar = qVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y12.a.C5959a.class), oVar, hVar);
        zVar.x(q0.c(y12.a.Error.class), oVar, qVar.new i(null));
        zVar.v(q0.c(y12.a.SearchConditionSelected.class), oVar, qVar.new j(null));
        zVar.v(q0.c(y12.a.RecipientTypeSelected.class), oVar, qVar.new k(null));
        zVar.v(q0.c(y12.a.ValueChanged.class), oVar, new l(null));
        zVar.x(q0.c(y12.a.FocusChanged.class), oVar, qVar.new m(null));
        zVar.x(q0.c(y12.a.k.class), oVar, qVar.new n(null));
        zVar.v(q0.c(y12.a.c.class), oVar, new o(null));
        zVar.v(q0.c(y12.a.ValidateAddress.class), oVar, qVar.new p(null));
        zVar.v(q0.c(y12.a.ValidateBailiffNames.class), oVar, qVar.new c(null));
        zVar.v(q0.c(y12.a.ValidateIdentifier.class), oVar, qVar.new d(null));
        zVar.x(q0.c(y12.a.h.class), oVar, qVar.new e(null));
        zVar.x(q0.c(y12.a.GoToAuthorization.class), oVar, qVar.new f(null));
        zVar.v(q0.c(y12.a.j.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> T9(final c0<State> state, Set<? extends t02.j.Params.InterfaceC4838a> params, final boolean shouldScroll, boolean shouldGoToSearch) {
        oq.r rVarA;
        t02.j.Results resultsB = this.validateAddressUC.b(new t02.j.Params(params));
        List<t02.j.Results.a> listA = resultsB.a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (((t02.j.Results.a) it.next()).getValue() instanceof hz.b.Invalid) {
                    final Map mapW = v0.w(state.a().getFields().a());
                    List<t02.j.Results.a> listA2 = resultsB.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listA2, 10)), 16));
                    for (t02.j.Results.a aVar : listA2) {
                        if (aVar instanceof t02.j.Results.a.d) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.COUNTRY, ((t02.j.Results.a.d) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.C4840a) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.APARTMENT_NUMBER, ((t02.j.Results.a.C4840a) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.C4841b) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.BUILDING_NUMBER, ((t02.j.Results.a.C4841b) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.c) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.CITY, ((t02.j.Results.a.c) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.g) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.PUBLIC_NAME, ((t02.j.Results.a.g) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.f) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.POSTCODE, ((t02.j.Results.a.f) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.h) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.STREET, ((t02.j.Results.a.h) aVar).getValue());
                        } else if (aVar instanceof t02.j.Results.a.e) {
                            rVarA = oq.y.a(m02.a.EnumC2987a.NAME, ((t02.j.Results.a.e) aVar).getValue());
                        } else {
                            if (!(aVar instanceof t02.j.Results.a.i)) {
                                throw new oq.p();
                            }
                            rVarA = oq.y.a(m02.a.EnumC2987a.SURNAME, ((t02.j.Results.a.i) aVar).getValue());
                        }
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        m02.a.EnumC2987a enumC2987a = (m02.a.EnumC2987a) entry.getKey();
                        hz.b bVar = (hz.b) entry.getValue();
                        Field field = (Field) mapW.get(enumC2987a);
                        if (field != null) {
                            mapW.put(enumC2987a, Field.b(field, null, bVar, 1, null));
                        }
                    }
                    return state.b(new er.l() { // from class: y12.n
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q.U9(state, mapW, shouldScroll, (State) obj);
                        }
                    });
                }
            }
        }
        if (shouldGoToSearch) {
            d9(y12.a.h.f223173a);
        }
        return state.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State U9(c0 c0Var, Map map, boolean z15, State state) {
        m02.b publicAddress;
        Object next;
        f02.a searchCondition = ((State) c0Var.a()).getSearchCondition();
        if (searchCondition instanceof f02.a.AbstractC1288a) {
            publicAddress = new m02.b.BailiffAddress(map);
        } else {
            if (!(searchCondition instanceof f02.a.b)) {
                throw new oq.p();
            }
            publicAddress = new m02.b.PublicAddress(map);
        }
        m02.b bVar = publicAddress;
        m02.a aVar = null;
        if (z15) {
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Field) ((Map.Entry) next).getValue()).getState() instanceof hz.b.Invalid));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                aVar = (m02.a) entry.getKey();
            }
        }
        return State.b(state, null, bVar, aVar, null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> V9(c0<State> state, Set<? extends t02.y.Params.InterfaceC4846a> params, final boolean shouldScroll, boolean shouldGoToSearch) {
        oq.r rVarA;
        t02.y.Results resultsB = this.validateNamesUC.b(new t02.y.Params(params));
        List<t02.y.Results.a> listA = resultsB.a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (((t02.y.Results.a) it.next()).getValue() instanceof hz.b.Invalid) {
                    final Map mapW = v0.w(state.a().getFields().a());
                    List<t02.y.Results.a> listA2 = resultsB.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listA2, 10)), 16));
                    for (t02.y.Results.a aVar : listA2) {
                        if (aVar instanceof t02.y.Results.a.C4848a) {
                            rVarA = oq.y.a(m02.a.d.NAME, ((t02.y.Results.a.C4848a) aVar).getValue());
                        } else {
                            if (!(aVar instanceof t02.y.Results.a.C4849b)) {
                                throw new oq.p();
                            }
                            rVarA = oq.y.a(m02.a.d.SURNAME, ((t02.y.Results.a.C4849b) aVar).getValue());
                        }
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        m02.a.d dVar = (m02.a.d) entry.getKey();
                        hz.b bVar = (hz.b) entry.getValue();
                        Field field = (Field) mapW.get(dVar);
                        if (field != null) {
                            mapW.put(dVar, Field.b(field, null, bVar, 1, null));
                        }
                    }
                    return state.b(new er.l() { // from class: y12.m
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q.W9(mapW, shouldScroll, (State) obj);
                        }
                    });
                }
            }
        }
        if (shouldGoToSearch) {
            d9(y12.a.h.f223173a);
        }
        return state.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State W9(Map map, boolean z15, State state) {
        Object next;
        m02.b.BailiffNames bailiffNames = new m02.b.BailiffNames(map);
        m02.a aVar = null;
        if (z15) {
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Field) ((Map.Entry) next).getValue()).getState() instanceof hz.b.Invalid));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                aVar = (m02.a) entry.getKey();
            }
        }
        return State.b(state, null, bailiffNames, aVar, null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<State> X9(final c0<State> state, Set<? extends t02.w.Params.a> params, final boolean shouldScroll, boolean shouldGoToSearch) {
        oq.r rVarA;
        t02.w.Results resultsB = this.validateIdentifierUC.b(new t02.w.Params(params));
        List<t02.w.Results.a> listA = resultsB.a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (((t02.w.Results.a) it.next()).getValue() instanceof hz.b.Invalid) {
                    final Map mapW = v0.w(state.a().getFields().a());
                    List<t02.w.Results.a> listA2 = resultsB.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listA2, 10)), 16));
                    for (t02.w.Results.a aVar : listA2) {
                        if (aVar instanceof t02.w.Results.a.C4845c) {
                            rVarA = oq.y.a(m02.a.c.NIP, ((t02.w.Results.a.C4845c) aVar).getValue());
                        } else if (aVar instanceof t02.w.Results.a.b) {
                            rVarA = oq.y.a(m02.a.c.KRS, ((t02.w.Results.a.b) aVar).getValue());
                        } else if (aVar instanceof t02.w.Results.a.d) {
                            rVarA = oq.y.a(m02.a.c.PESEL, ((t02.w.Results.a.d) aVar).getValue());
                        } else if (aVar instanceof t02.w.Results.a.e) {
                            rVarA = oq.y.a(m02.a.c.REGON, ((t02.w.Results.a.e) aVar).getValue());
                        } else {
                            if (!(aVar instanceof t02.w.Results.a.C4844a)) {
                                throw new oq.p();
                            }
                            rVarA = oq.y.a(m02.a.c.EUROPEAN_ID, ((t02.w.Results.a.C4844a) aVar).getValue());
                        }
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        m02.a.c cVar = (m02.a.c) entry.getKey();
                        hz.b bVar = (hz.b) entry.getValue();
                        Field field = (Field) mapW.get(cVar);
                        if (field != null) {
                            mapW.put(cVar, Field.b(field, null, bVar, 1, null));
                        }
                    }
                    return state.b(new er.l() { // from class: y12.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return q.Y9(state, mapW, shouldScroll, (State) obj);
                        }
                    });
                }
            }
        }
        if (shouldGoToSearch) {
            d9(y12.a.h.f223173a);
        }
        return state.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State Y9(c0 c0Var, Map map, boolean z15, State state) {
        m02.b publicIdentifier;
        Object next;
        f02.a searchCondition = ((State) c0Var.a()).getSearchCondition();
        if (searchCondition instanceof f02.a.AbstractC1288a) {
            publicIdentifier = new m02.b.BailiffIdentifier(map);
        } else {
            if (!(searchCondition instanceof f02.a.b)) {
                throw new oq.p();
            }
            publicIdentifier = new m02.b.PublicIdentifier(map);
        }
        m02.b bVar = publicIdentifier;
        m02.a aVar = null;
        if (z15) {
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Field) ((Map.Entry) next).getValue()).getState() instanceof hz.b.Invalid));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                aVar = (m02.a) entry.getKey();
            }
        }
        return State.b(state, null, bVar, aVar, null, 9, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<y12.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, y12.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y12.c.Data> getState() {
        return this.state;
    }
}
