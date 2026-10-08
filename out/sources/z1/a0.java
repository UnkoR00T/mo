package z1;

import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.c6;
import q4.a4;
import q4.z3;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001e\u0010\u0012J*\u0010!\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b#\u0010\u0012J7\u0010'\u001a\u00020\u0010*\u00020$2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00100%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R/\u0010@\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lz1/a0;", "Lz1/x;", "Ltq/i;", "coroutineContext", "Landroid/content/Context;", "context", "Lz1/i0;", "selectedTextType", "Lx4/d;", "localeList", "<init>", "(Ltq/i;Landroid/content/Context;Lz1/i0;Lx4/d;)V", "", "text", "Lq4/z3;", "selection", "Loq/i0;", "p", "(Ljava/lang/CharSequence;JLtq/e;)Ljava/lang/Object;", "Landroid/view/textclassifier/TextClassifier;", "textClassifier", "m", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ltq/e;)Ljava/lang/Object;", "T", "Lkotlin/Function2;", "Ltq/e;", "", "block", "q", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "c", "Lm3/e;", "secondaryClickLocation", "b", "(Ljava/lang/CharSequence;JLm3/e;Ltq/e;)Ljava/lang/Object;", "a", "Lp1/a;", "Lkotlin/Function1;", "child", "l", "(Lp1/a;Ljava/lang/CharSequence;JLer/l;)V", "Landroid/view/textclassifier/TextClassification;", "s", "(Ljava/lang/CharSequence;J)Landroid/view/textclassifier/TextClassification;", "Ltq/i;", "Landroid/content/Context;", "Lz1/i0;", "d", "Lx4/d;", "Lsu/a;", "e", "Lsu/a;", "mutex", "f", "Landroid/view/textclassifier/TextClassifier;", "textClassificationSession", "Lz1/v1;", "<set-?>", "g", "Lm2/a3;", "o", "()Lz1/v1;", "r", "(Lz1/v1;)V", "textClassificationResult", "h", "Ljava/lang/Object;", "AssistantItemKey", "Landroid/os/LocaleList;", "n", "()Landroid/os/LocaleList;", "androidLocalList", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.i coroutineContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 selectedTextType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private TextClassifier textClassificationSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 textClassificationResult = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object AssistantItemKey = new Object();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f231921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f231922h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f231924k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231922h = obj;
            this.f231924k |= PKIFailureInfo.systemUnavail;
            return a0.this.m(null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Loq/i0;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<TextClassifier, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231926f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f231928h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f231929j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, long j15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f231928h = charSequence;
            this.f231929j = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231925e;
            if (i15 == 0) {
                oq.u.b(obj);
                TextClassifier textClassifier = (TextClassifier) this.f231926f;
                a0 a0Var = a0.this;
                CharSequence charSequence = this.f231928h;
                long j15 = this.f231929j;
                this.f231925e = 1;
                if (a0Var.m(charSequence, j15, textClassifier, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(TextClassifier textClassifier, tq.e<? super oq.i0> eVar) {
            return ((b) v(textClassifier, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = a0.this.new b(this.f231928h, this.f231929j, eVar);
            bVar.f231926f = obj;
            return bVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231932g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.p<TextClassifier, tq.e<? super T>, Object> f231934j;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super T>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231935e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ TextClassifier f231936f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.p<TextClassifier, tq.e<? super T>, Object> f231937g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(TextClassifier textClassifier, er.p<? super TextClassifier, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231936f = textClassifier;
                this.f231937g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f231935e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                TextClassifier textClassifier = this.f231936f;
                if (textClassifier == null) {
                    return null;
                }
                er.p<TextClassifier, tq.e<? super T>, Object> pVar = this.f231937g;
                this.f231935e = 1;
                Object objB = pVar.B(textClassifier, this);
                return objB == objE ? objE : objB;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f231936f, this.f231937g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroid/view/textclassifier/TextClassifier;", "<anonymous>", "(Lju/p0;)Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<ju.p0, tq.e<? super TextClassifier>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231938e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f231939f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a0 a0Var, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f231939f = a0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f231938e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                TextClassifier textClassifierA = y1.f232265a.a(this.f231939f.context, this.f231939f.selectedTextType);
                this.f231939f.textClassificationSession = textClassifierA;
                return textClassifierA;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super TextClassifier> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f231939f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.p<? super TextClassifier, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231934j = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0093 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a0 a0Var;
            su.a aVar2;
            Throwable th4;
            TextClassifier textClassifier;
            Object objE;
            Object objE2 = uq.b.e();
            int i15 = this.f231932g;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    aVar = a0.this.mutex;
                    a0Var = a0.this;
                    this.f231930e = aVar;
                    this.f231931f = a0Var;
                    this.f231932g = 1;
                    if (aVar.h(null, this) != objE2) {
                    }
                    return objE2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return obj;
                    }
                    aVar2 = (su.a) this.f231930e;
                    try {
                        oq.u.b(obj);
                        textClassifier = (TextClassifier) obj;
                        aVar = aVar2;
                        aVar.r(null);
                        a aVar3 = new a(textClassifier, this.f231934j, null);
                        this.f231930e = null;
                        this.f231931f = null;
                        this.f231932g = 3;
                        objE = ju.g3.e(200L, aVar3, this);
                        if (objE == objE2) {
                            return objE2;
                        }
                        return objE;
                    } catch (Throwable th5) {
                        th4 = th5;
                        aVar2.r(null);
                        throw th4;
                    }
                }
                a0Var = (a0) this.f231931f;
                su.a aVar4 = (su.a) this.f231930e;
                oq.u.b(obj);
                aVar = aVar4;
                textClassifier = a0Var.textClassificationSession;
                if (textClassifier == null || textClassifier.isDestroyed()) {
                    b bVar = new b(a0Var, null);
                    this.f231930e = aVar;
                    this.f231931f = null;
                    this.f231932g = 2;
                    Object objE3 = ju.g3.e(300L, bVar, this);
                    if (objE3 != objE2) {
                        aVar2 = aVar;
                        obj = objE3;
                        textClassifier = (TextClassifier) obj;
                        aVar = aVar2;
                        aVar.r(null);
                        a aVar5 = new a(textClassifier, this.f231934j, null);
                        this.f231930e = null;
                        this.f231931f = null;
                        this.f231932g = 3;
                        objE = ju.g3.e(200L, aVar5, this);
                        if (objE == objE2) {
                            return objE;
                        }
                    }
                } else {
                    aVar.r(null);
                    a aVar6 = new a(textClassifier, this.f231934j, null);
                    this.f231930e = null;
                    this.f231931f = null;
                    this.f231932g = 3;
                    objE = ju.g3.e(200L, aVar6, this);
                    if (objE == objE2) {
                        return objE;
                    }
                }
                return objE2;
            } catch (Throwable th6) {
                aVar2 = aVar;
                th4 = th6;
                aVar2.r(null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super T> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new c(this.f231934j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Lq4/z3;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Lq4/z3;"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<TextClassifier, tq.e<? super z3>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f231943h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f231944j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f231945k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ CharSequence f231946l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f231947m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ a0 f231948n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence, long j15, a0 a0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f231946l = charSequence;
            this.f231947m = j15;
            this.f231948n = a0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            long j15;
            a0 a0Var;
            su.a aVar;
            CharSequence charSequence;
            long j16;
            TextSelection textSelection;
            Object objE = uq.b.e();
            int i15 = this.f231944j;
            if (i15 == 0) {
                oq.u.b(obj);
                TextClassifier textClassifier = (TextClassifier) this.f231945k;
                c0.a();
                TextSelection.Request.Builder defaultLocales = b0.a(this.f231946l, z3.l(this.f231947m), z3.k(this.f231947m)).setDefaultLocales(this.f231948n.n());
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31) {
                    defaultLocales.setIncludeTextClassification(true);
                }
                TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                long jB = a4.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                if (i16 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                    a0 a0Var2 = this.f231948n;
                    CharSequence charSequence2 = this.f231946l;
                    this.f231943h = jB;
                    this.f231944j = 2;
                    if (a0Var2.m(charSequence2, jB, textClassifier, this) != objE) {
                        j15 = jB;
                        j16 = j15;
                    }
                } else {
                    su.a aVar2 = this.f231948n.mutex;
                    a0Var = this.f231948n;
                    CharSequence charSequence3 = this.f231946l;
                    this.f231945k = textSelectionSuggestSelection;
                    this.f231940e = aVar2;
                    this.f231941f = a0Var;
                    this.f231942g = charSequence3;
                    this.f231943h = jB;
                    this.f231944j = 1;
                    if (aVar2.h(null, this) != objE) {
                        aVar = aVar2;
                        charSequence = charSequence3;
                        j16 = jB;
                        textSelection = textSelectionSuggestSelection;
                        a0Var.r(new TextClassificationResult(charSequence, j16, textSelection.getTextClassification(), null));
                        oq.i0 i0Var = oq.i0.f148189a;
                    }
                }
                return objE;
            }
            if (i15 == 1) {
                long j17 = this.f231943h;
                CharSequence charSequence4 = (CharSequence) this.f231942g;
                a0Var = (a0) this.f231941f;
                aVar = (su.a) this.f231940e;
                textSelection = (TextSelection) this.f231945k;
                oq.u.b(obj);
                j16 = j17;
                charSequence = charSequence4;
                try {
                    a0Var.r(new TextClassificationResult(charSequence, j16, textSelection.getTextClassification(), null));
                    oq.i0 i0Var2 = oq.i0.f148189a;
                } finally {
                    aVar.r(null);
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = this.f231943h;
                oq.u.b(obj);
                j16 = j15;
            }
            return z3.b(j16);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(TextClassifier textClassifier, tq.e<? super z3> eVar) {
            return ((d) v(textClassifier, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f231946l, this.f231947m, this.f231948n, eVar);
            dVar.f231945k = obj;
            return dVar;
        }
    }

    public a0(tq.i iVar, Context context, i0 i0Var, LocaleList localeList) {
        this.coroutineContext = iVar;
        this.context = context;
        this.selectedTextType = i0Var;
        this.localeList = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(CharSequence charSequence, long j15, TextClassifier textClassifier, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        su.a aVar2;
        TextClassifier textClassifier2;
        long j16;
        CharSequence charSequence2;
        TextClassification textClassificationClassifyText;
        su.a aVar3;
        long j17;
        CharSequence charSequence3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231924k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231924k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f231922h;
        Object objE = uq.b.e();
        int i16 = aVar.f231924k;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                aVar2 = this.mutex;
                aVar.f231918d = charSequence;
                aVar.f231919e = textClassifier;
                aVar.f231920f = aVar2;
                aVar.f231921g = j15;
                aVar.f231924k = 1;
                if (aVar2.h(null, aVar) != objE) {
                    textClassifier2 = textClassifier;
                    j16 = j15;
                    charSequence2 = charSequence;
                }
                return objE;
            }
            if (i16 == 1) {
                j16 = aVar.f231921g;
                aVar2 = (su.a) aVar.f231920f;
                textClassifier2 = (TextClassifier) aVar.f231919e;
                charSequence2 = (CharSequence) aVar.f231918d;
                oq.u.b(obj);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j18 = aVar.f231921g;
                aVar3 = (su.a) aVar.f231920f;
                textClassificationClassifyText = (TextClassification) aVar.f231919e;
                CharSequence charSequence4 = (CharSequence) aVar.f231918d;
                oq.u.b(obj);
                charSequence3 = charSequence4;
                j17 = j18;
            }
            try {
                r(new TextClassificationResult(charSequence3, j17, textClassificationClassifyText, null));
                oq.i0 i0Var = oq.i0.f148189a;
                return oq.i0.f148189a;
            } finally {
                aVar3.r(null);
            }
            TextClassificationResult textClassificationResultO = o();
            if (textClassificationResultO != null && f0.g(textClassificationResultO, charSequence2, j16)) {
                oq.i0 i0Var2 = oq.i0.f148189a;
                aVar2.r(null);
                return i0Var2;
            }
            oq.i0 i0Var3 = oq.i0.f148189a;
            aVar2.r(null);
            z.a();
            textClassificationClassifyText = textClassifier2.classifyText(y.a(charSequence2, z3.l(j16), z3.k(j16)).setDefaultLocales(n()).build());
            su.a aVar4 = this.mutex;
            aVar.f231918d = charSequence2;
            aVar.f231919e = textClassificationClassifyText;
            aVar.f231920f = aVar4;
            aVar.f231921g = j16;
            aVar.f231924k = 2;
            if (aVar4.h(null, aVar) != objE) {
                aVar3 = aVar4;
                j17 = j16;
                charSequence3 = charSequence2;
                r(new TextClassificationResult(charSequence3, j17, textClassificationClassifyText, null));
                oq.i0 i0Var4 = oq.i0.f148189a;
                return oq.i0.f148189a;
            }
            return objE;
        } catch (Throwable th4) {
            aVar2.r(null);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList n() {
        android.os.LocaleList localeListC;
        LocaleList localeList = this.localeList;
        return (localeList == null || (localeListC = y1.f232265a.c(localeList)) == null) ? new android.os.LocaleList(x4.c.INSTANCE.a().getPlatformLocale()) : localeListC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TextClassificationResult o() {
        return (TextClassificationResult) this.textClassificationResult.getValue();
    }

    private final Object p(CharSequence charSequence, long j15, tq.e<? super oq.i0> eVar) {
        return (charSequence.length() == 0 || z3.h(j15)) ? oq.i0.f148189a : q(new b(charSequence, j15, null), eVar);
    }

    private final <T> Object q(er.p<? super TextClassifier, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return ju.i.g(this.coroutineContext, new c(pVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(TextClassificationResult textClassificationResult) {
        this.textClassificationResult.setValue(textClassificationResult);
    }

    @Override // z1.x
    public Object a(CharSequence charSequence, long j15, tq.e<? super oq.i0> eVar) {
        Object objP = p(charSequence, j15, eVar);
        return objP == uq.b.e() ? objP : oq.i0.f148189a;
    }

    @Override // z1.x
    public Object b(CharSequence charSequence, long j15, m3.e eVar, tq.e<? super oq.i0> eVar2) {
        Object objP = p(charSequence, j15, eVar2);
        return objP == uq.b.e() ? objP : oq.i0.f148189a;
    }

    @Override // z1.x
    public Object c(CharSequence charSequence, long j15, tq.e<? super z3> eVar) {
        if (charSequence.length() == 0 || z3.h(j15)) {
            return null;
        }
        return q(new d(charSequence, j15, this, null), eVar);
    }

    public final void l(p1.a aVar, CharSequence charSequence, long j15, er.l<? super p1.a, oq.i0> lVar) {
        TextClassification textClassificationS = s(charSequence, j15);
        if (textClassificationS == null) {
            lVar.b(aVar);
            return;
        }
        if (!textClassificationS.getActions().isEmpty()) {
            p1.c.c(aVar, this.AssistantItemKey, textClassificationS, 0);
        } else if (y1.f232265a.b(textClassificationS)) {
            p1.c.c(aVar, this.AssistantItemKey, textClassificationS, -1);
        }
        lVar.b(aVar);
        List<RemoteAction> actions = textClassificationS.getActions();
        int size = actions.size();
        for (int i15 = 0; i15 < size; i15++) {
            actions.get(i15);
            if (i15 > 0) {
                p1.c.c(aVar, this.AssistantItemKey, textClassificationS, i15);
            }
        }
    }

    public final TextClassification s(CharSequence text, long selection) {
        if (!su.a.C4762a.b(this.mutex, null, 1, null)) {
            return null;
        }
        TextClassificationResult textClassificationResultO = o();
        TextClassification textClassification = (textClassificationResultO == null || !f0.g(textClassificationResultO, text, selection)) ? null : textClassificationResultO.getTextClassification();
        su.a.C4762a.c(this.mutex, null, 1, null);
        return textClassification;
    }
}
