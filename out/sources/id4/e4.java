package id4;

import android.content.Intent;
import h94.ToSchoolBehavior;
import k34.DeleteCert;
import ma4.ToSchoolLessonDetails;
import ma4.ToSchoolTimetable;
import o73.StudentCardActivated;
import o73.ToAddJuniorSchoolCard;
import o73.ToExtendStudentCardValidity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q84.ToAbsenceStatusDetails;
import q84.ToSchoolAttendance;
import rq2.ToPassportInvalidation;
import s93.ToCountryDetails;
import tz0.ToGenericApplicationForms;
import u94.ToGradeDetails;
import u94.ToSchoolGrades;
import v04.ShowSnackbarEvent;
import wn3.FromDynamicDocument;
import wn3.FromDynamicMultiDocument;
import wn3.FromFamilyCard;
import wn3.FromRailwayCard;
import wn3.FromRefugeeCard;
import wn3.FromWru;
import wn3.WithDeeplink;
import xd4.DynamicDocument;
import xd4.DynamicMultiDocument;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00032\u00020\u0004B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020)H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010[\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010h\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lid4/e4;", "Ll00/g;", "Lid4/a4;", "", "Lgx/c;", "Lyy/a;", "stateMachineFactory", "Li70/e;", "globalSnackBarManager", "Lgx/d;", "globalEventManager", "Lsw/a;", "developerSettingsManager", "Ls54/k;", "setLocalNotificationUseCase", "Llt0/d;", "markNotificationAsDisplayedUseCase", "Lab4/a;", "getApplicationLockStateUseCase", "Lq34/v;", "deleteDocumentByIdentityTypeUseCase", "Lw24/k;", "deleteDocumentByCertificateTypeUC", "Loz/t;", "restartApplicationManager", "La14/q;", "goToStoreIntentUseCase", "Lv64/q;", "logoutUC", "Lxw/d;", "dispatcherProvider", "Lmz/l;", "intentManager", "Lv64/o;", "isUserLoggedInUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "<init>", "(Lyy/a;Li70/e;Lgx/d;Lsw/a;Ls54/k;Llt0/d;Lab4/a;Lq34/v;Lw24/k;Loz/t;La14/q;Lv64/q;Lxw/d;Lmz/l;Lv64/o;Lc54/b;)V", "", "notificationMessageId", "Loq/i0;", "y9", "(Ljava/lang/String;)V", "Lgx/b;", "event", "", "j5", "(Lgx/b;)Z", "Y8", "()V", "Landroid/content/Intent;", "intent", "z9", "(Landroid/content/Intent;)V", "b", "Li70/e;", "c", "Lgx/d;", "d", "Lsw/a;", "e", "Ls54/k;", "f", "Llt0/d;", "g", "Lab4/a;", "h", "Lq34/v;", "j", "Lw24/k;", "k", "Loz/t;", "l", "La14/q;", "m", "Lv64/q;", "n", "Lxw/d;", "p", "Lmz/l;", "q", "Lv64/o;", "r", "Lc54/b;", "Lxw/b;", "Lid4/i;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lid4/b4;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e4 extends l00.g<id4.a4, Object> implements l00.e, zx.d, gx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sw.a developerSettingsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s54.k setLocalNotificationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lt0.d markNotificationAsDisplayedUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ab4.a getApplicationLockStateUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q34.v deleteDocumentByIdentityTypeUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final w24.k deleteDocumentByCertificateTypeUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.t restartApplicationManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final v64.q logoutUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mz.l intentManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final v64.o isUserLoggedInUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<id4.i> navAction = new xw.b<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<id4.a4, Object> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<b4> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91283e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f91285g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f91285g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91283e;
            if (i15 == 0) {
                oq.u.b(obj);
                lt0.d dVar = e4.this.markNotificationAsDisplayedUseCase;
                lt0.d.Params params = new lt0.d.Params(this.f91285g);
                this.f91283e = 1;
                if (dVar.c(params, this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return e4.this.new a(this.f91285g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/e3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/e3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<OpenSchoolTimetable, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91287f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolTimetable openSchoolTimetable = (OpenSchoolTimetable) this.f91287f;
            Object objE = uq.b.e();
            int i15 = this.f91286e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolTimetable toSchoolTimetable = new id4.i.ToSchoolTimetable(openSchoolTimetable.getStudentId());
                this.f91287f = vq.j.a(openSchoolTimetable);
                this.f91286e = 1;
                if (e4Var.F(toSchoolTimetable, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolTimetable openSchoolTimetable, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            a0 a0Var = e4.this.new a0(eVar);
            a0Var.f91287f = openSchoolTimetable;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/l0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/l0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class a1 extends vq.k implements er.q<OpenDefaultNotificationDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91290f;

        a1(tq.e<? super a1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDefaultNotificationDetails openDefaultNotificationDetails = (OpenDefaultNotificationDetails) this.f91290f;
            Object objE = uq.b.e();
            int i15 = this.f91289e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!openDefaultNotificationDetails.getData().getMessageDisplayed()) {
                    e4.this.y9(openDefaultNotificationDetails.getData().getMessageId());
                }
                e4 e4Var = e4.this;
                id4.i.ToDefaultNotificationDetails toDefaultNotificationDetails = new id4.i.ToDefaultNotificationDetails(openDefaultNotificationDetails.getData());
                this.f91290f = vq.j.a(openDefaultNotificationDetails);
                this.f91289e = 1;
                if (e4Var.F(toDefaultNotificationDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDefaultNotificationDetails openDefaultNotificationDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            a1 a1Var = e4.this.new a1(eVar);
            a1Var.f91290f = openDefaultNotificationDetails;
            return a1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/l2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/l2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class a2 extends vq.k implements er.q<id4.l2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91292e;

        a2(tq.e<? super a2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91292e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.i2 i2Var = id4.i.i2.f91686a;
                this.f91292e = 1;
                if (e4Var.F(i2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.l2 l2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new a2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/g0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/g0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class a3 extends vq.k implements er.q<id4.g0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91294e;

        a3(tq.e<? super a3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91294e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.b0 b0Var = id4.i.b0.f91647a;
                this.f91294e = 1;
                if (e4Var.F(b0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.g0 g0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new a3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/x3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/x3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class a4 extends vq.k implements er.q<id4.x3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91296e;

        a4(tq.e<? super a4> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91296e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.d dVar = id4.i.d.f91656a;
                this.f91296e = 1;
                if (e4Var.F(dVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.x3 x3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new a4(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<b4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f91298a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f91299a;

            /* JADX INFO: renamed from: id4.e4$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2173a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f91300d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f91301e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f91302f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f91304h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f91305j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f91306k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f91307l;

                public C2173a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f91300d = obj;
                    this.f91301e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f91299a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2173a c2173a;
                if (eVar instanceof C2173a) {
                    c2173a = (C2173a) eVar;
                    int i15 = c2173a.f91301e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2173a.f91301e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2173a = new C2173a(eVar);
                    }
                } else {
                    c2173a = new C2173a(eVar);
                }
                Object obj2 = c2173a.f91300d;
                Object objE = uq.b.e();
                int i16 = c2173a.f91301e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f91299a;
                    b4 b4Var = b4.f91243a;
                    c2173a.f91302f = vq.j.a(obj);
                    c2173a.f91304h = vq.j.a(c2173a);
                    c2173a.f91305j = vq.j.a(obj);
                    c2173a.f91306k = vq.j.a(hVar);
                    c2173a.f91307l = 0;
                    c2173a.f91301e = 1;
                    if (hVar.F(b4Var, c2173a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar) {
            this.f91298a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super b4> hVar, tq.e eVar) {
            Object objA = this.f91298a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/z2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/z2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<OpenSchoolBehavior, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91309f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolBehavior openSchoolBehavior = (OpenSchoolBehavior) this.f91309f;
            Object objE = uq.b.e();
            int i15 = this.f91308e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolBehavior toSchoolBehavior = new id4.i.ToSchoolBehavior(openSchoolBehavior.getStudentId());
                this.f91309f = vq.j.a(openSchoolBehavior);
                this.f91308e = 1;
                if (e4Var.F(toSchoolBehavior, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolBehavior openSchoolBehavior, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            b0 b0Var = e4.this.new b0(eVar);
            b0Var.f91309f = openSchoolBehavior;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/e;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/e;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class b1 extends vq.k implements er.q<id4.e, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f91312f;

        b1(tq.e<? super b1> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r5.F(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f91312f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L48
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L30
            L1e:
                oq.u.b(r5)
                id4.e4 r5 = id4.e4.this
                ab4.a r5 = id4.e4.m9(r5)
                r4.f91312f = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L47
            L30:
                za4.a r1 = za4.a.LOCKED
                if (r5 != r1) goto L35
                goto L36
            L35:
                r3 = 0
            L36:
                id4.e4 r5 = id4.e4.this
                id4.i$o1 r1 = new id4.i$o1
                r1.<init>(r3)
                r4.f91311e = r3
                r4.f91312f = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: id4.e4.b1.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.e eVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar2) {
            return e4.this.new b1(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/s;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/s;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class b2 extends vq.k implements er.q<id4.s, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91314e;

        b2(tq.e<? super b2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91314e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.n nVar = id4.i.n.f91712a;
                this.f91314e = 1;
                if (e4Var.F(nVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.s sVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new b2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/f0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/f0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class b3 extends vq.k implements er.q<id4.f0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91316e;

        b3(tq.e<? super b3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91316e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.a0 a0Var = id4.i.a0.f91638a;
                this.f91316e = 1;
                if (e4Var.F(a0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.f0 f0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new b3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/f3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/f3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenSettings, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f91318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f91319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f91320g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91322a;

            static {
                int[] iArr = new int[e53.a.ToSettings.EnumC1095a.values().length];
                try {
                    iArr[e53.a.ToSettings.EnumC1095a.BIOMETRIC_LOGIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e53.a.ToSettings.EnumC1095a.CHANGE_PASSWORD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e53.a.ToSettings.EnumC1095a.TURN_ON_BIOMETRIC_LOGIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e53.a.ToSettings.EnumC1095a.CONTACT_DETAILS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e53.a.ToSettings.EnumC1095a.LANGUAGE_SWITCH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f91322a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ud4.b bVar;
            OpenSettings openSettings = (OpenSettings) this.f91320g;
            Object objE = uq.b.e();
            int i15 = this.f91319f;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f91322a[openSettings.getDestination().ordinal()];
                if (i16 == 1) {
                    bVar = ud4.b.a.f197789a;
                } else if (i16 == 2) {
                    bVar = ud4.b.C5139b.f197791a;
                } else if (i16 == 3) {
                    bVar = ud4.b.e.f197797a;
                } else if (i16 == 4) {
                    bVar = ud4.b.c.f197793a;
                } else {
                    if (i16 != 5) {
                        throw new oq.p();
                    }
                    bVar = ud4.b.d.f197795a;
                }
                e4 e4Var = e4.this;
                id4.i.ToSettings toSettings = new id4.i.ToSettings(bVar);
                this.f91320g = vq.j.a(openSettings);
                this.f91318e = vq.j.a(bVar);
                this.f91319f = 1;
                if (e4Var.F(toSettings, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSettings openSettings, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            c cVar = e4.this.new c(eVar);
            cVar.f91320g = openSettings;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/c3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/c3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<OpenSchoolGradesDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91324f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolGradesDetails openSchoolGradesDetails = (OpenSchoolGradesDetails) this.f91324f;
            Object objE = uq.b.e();
            int i15 = this.f91323e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolGradesDetails toSchoolGradesDetails = new id4.i.ToSchoolGradesDetails(openSchoolGradesDetails.getStudentId(), openSchoolGradesDetails.getGradeId());
                this.f91324f = vq.j.a(openSchoolGradesDetails);
                this.f91323e = 1;
                if (e4Var.F(toSchoolGradesDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolGradesDetails openSchoolGradesDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            c0 c0Var = e4.this.new c0(eVar);
            c0Var.f91324f = openSchoolGradesDetails;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/p1;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/p1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class c1 extends vq.k implements er.q<OpenInstantPaymentsDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91327f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91329a;

            static {
                int[] iArr = new int[w32.a.values().length];
                try {
                    iArr[w32.a.NOTIFICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w32.a.NOTIFICATIONS_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f91329a = iArr;
            }
        }

        c1(tq.e<? super c1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            OpenInstantPaymentsDetails openInstantPaymentsDetails = (OpenInstantPaymentsDetails) this.f91327f;
            Object objE = uq.b.e();
            int i15 = this.f91326e;
            if (i15 == 0) {
                oq.u.b(obj);
                String messageId = openInstantPaymentsDetails.getEvent().getData().getMessageId();
                if (messageId != null) {
                    e4 e4Var = e4.this;
                    if (!openInstantPaymentsDetails.getEvent().getData().getMessageDisplayed()) {
                        e4Var.y9(messageId);
                    }
                }
                e4 e4Var2 = e4.this;
                String paymentId = openInstantPaymentsDetails.getEvent().getData().getPaymentId();
                int i16 = a.f91329a[openInstantPaymentsDetails.getEvent().getEntryPoint().ordinal()];
                if (i16 == 1) {
                    z15 = true;
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    z15 = false;
                }
                id4.i.ToInstantPaymentsDetails toInstantPaymentsDetails = new id4.i.ToInstantPaymentsDetails(paymentId, z15);
                this.f91327f = vq.j.a(openInstantPaymentsDetails);
                this.f91326e = 1;
                if (e4Var2.F(toInstantPaymentsDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenInstantPaymentsDetails openInstantPaymentsDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            c1 c1Var = e4.this.new c1(eVar);
            c1Var.f91327f = openInstantPaymentsDetails;
            return c1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/r;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/r;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class c2 extends vq.k implements er.q<id4.r, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91330e;

        c2(tq.e<? super c2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91330e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.m mVar = id4.i.m.f91707a;
                this.f91330e = 1;
                if (e4Var.F(mVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.r rVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new c2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/o2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/o2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class c3 extends vq.k implements er.q<id4.o2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91332e;

        c3(tq.e<? super c3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91332e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.l2 l2Var = id4.i.l2.f91705a;
                this.f91332e = 1;
                if (e4Var.F(l2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.o2 o2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new c3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/s2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/s2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<id4.s2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91334e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91334e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.p2 p2Var = id4.i.p2.f91725a;
                this.f91334e = 1;
                if (e4Var.F(p2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.s2 s2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/d3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/d3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<OpenSchoolLessonDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91337f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolLessonDetails openSchoolLessonDetails = (OpenSchoolLessonDetails) this.f91337f;
            Object objE = uq.b.e();
            int i15 = this.f91336e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolLessonDetails toSchoolLessonDetails = new id4.i.ToSchoolLessonDetails(openSchoolLessonDetails.getStudentId(), openSchoolLessonDetails.getLessonId());
                this.f91337f = vq.j.a(openSchoolLessonDetails);
                this.f91336e = 1;
                if (e4Var.F(toSchoolLessonDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolLessonDetails openSchoolLessonDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            d0 d0Var = e4.this.new d0(eVar);
            d0Var.f91337f = openSchoolLessonDetails;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/h0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/h0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class d1 extends vq.k implements er.q<OpenConfirmation, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91340f;

        d1(tq.e<? super d1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenConfirmation openConfirmation = (OpenConfirmation) this.f91340f;
            Object objE = uq.b.e();
            int i15 = this.f91339e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!openConfirmation.getData().getMessageDisplayed()) {
                    e4.this.y9(openConfirmation.getData().getMessageId());
                }
                e4 e4Var = e4.this;
                id4.i.ToConfirmation toConfirmation = new id4.i.ToConfirmation(openConfirmation.getData());
                this.f91340f = vq.j.a(openConfirmation);
                this.f91339e = 1;
                if (e4Var.F(toConfirmation, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenConfirmation openConfirmation, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            d1 d1Var = e4.this.new d1(eVar);
            d1Var.f91340f = openConfirmation;
            return d1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/p3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/p3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class d2 extends vq.k implements er.q<id4.p3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91342e;

        d2(tq.e<? super d2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91342e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.m3 m3Var = id4.i.m3.f91711a;
                this.f91342e = 1;
                if (e4Var.F(m3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.p3 p3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new d2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/n2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/n2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class d3 extends vq.k implements er.q<id4.n2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91344e;

        d3(tq.e<? super d3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91344e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.k2 k2Var = id4.i.k2.f91699a;
                this.f91344e = 1;
                if (e4Var.F(k2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.n2 n2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new d3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/t;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/t;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<id4.t, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91346e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91346e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.o oVar = id4.i.o.f91717a;
                this.f91346e = 1;
                if (e4Var.F(oVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.t tVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/x2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/x2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<OpenSchoolAbsenceStatusDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91349f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolAbsenceStatusDetails openSchoolAbsenceStatusDetails = (OpenSchoolAbsenceStatusDetails) this.f91349f;
            Object objE = uq.b.e();
            int i15 = this.f91348e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolAbsenceStatusDetails toSchoolAbsenceStatusDetails = new id4.i.ToSchoolAbsenceStatusDetails(openSchoolAbsenceStatusDetails.getStudentId(), openSchoolAbsenceStatusDetails.getSemesterId(), openSchoolAbsenceStatusDetails.getAttendanceType());
                this.f91349f = vq.j.a(openSchoolAbsenceStatusDetails);
                this.f91348e = 1;
                if (e4Var.F(toSchoolAbsenceStatusDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolAbsenceStatusDetails openSchoolAbsenceStatusDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            e0 e0Var = e4.this.new e0(eVar);
            e0Var.f91349f = openSchoolAbsenceStatusDetails;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/l3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/l3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class e1 extends vq.k implements er.q<OpenVehicleCard, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91352f;

        e1(tq.e<? super e1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenVehicleCard openVehicleCard = (OpenVehicleCard) this.f91352f;
            Object objE = uq.b.e();
            int i15 = this.f91351e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToVehicleCard toVehicleCard = new id4.i.ToVehicleCard(openVehicleCard.getDestination());
                this.f91352f = vq.j.a(openVehicleCard);
                this.f91351e = 1;
                if (e4Var.F(toVehicleCard, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenVehicleCard openVehicleCard, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            e1 e1Var = e4.this.new e1(eVar);
            e1Var.f91352f = openVehicleCard;
            return e1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/q;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/q;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class e2 extends vq.k implements er.q<id4.q, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91354e;

        e2(tq.e<? super e2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91354e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.l lVar = id4.i.l.f91701a;
                this.f91354e = 1;
                if (e4Var.F(lVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.q qVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new e2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/h;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/h;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class e3 extends vq.k implements er.q<MalwareDetected, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91357f;

        e3(tq.e<? super e3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            MalwareDetected malwareDetected = (MalwareDetected) this.f91357f;
            Object objE = uq.b.e();
            int i15 = this.f91356e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.MalwareDetected malwareDetected2 = new id4.i.MalwareDetected(malwareDetected.getDangerousToolsName(), malwareDetected.getDangerousToolsPackage());
                this.f91357f = vq.j.a(malwareDetected);
                this.f91356e = 1;
                if (e4Var.F(malwareDetected2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(MalwareDetected malwareDetected, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            e3 e3Var = e4.this.new e3(eVar);
            e3Var.f91357f = malwareDetected;
            return e3Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/e2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/e2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<id4.e2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91359e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91359e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.b2 b2Var = id4.i.b2.f91649a;
                this.f91359e = 1;
                if (e4Var.F(b2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.e2 e2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/w2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/w2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<id4.w2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91361e;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91361e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.t2 t2Var = id4.i.t2.f91743a;
                this.f91361e = 1;
                if (e4Var.F(t2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.w2 w2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new f0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/g3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/g3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class f1 extends vq.k implements er.q<id4.g3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91363e;

        f1(tq.e<? super f1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91363e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.d3 d3Var = id4.i.d3.f91661a;
                this.f91363e = 1;
                if (e4Var.F(d3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.g3 g3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new f1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/j3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/j3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class f2 extends vq.k implements er.q<OpenUserData, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91366f;

        f2(tq.e<? super f2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUserData openUserData = (OpenUserData) this.f91366f;
            Object objE = uq.b.e();
            int i15 = this.f91365e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToUserData toUserData = new id4.i.ToUserData(openUserData.getForceFetchNewPassports());
                this.f91366f = vq.j.a(openUserData);
                this.f91365e = 1;
                if (e4Var.F(toUserData, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUserData openUserData, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            f2 f2Var = e4.this.new f2(eVar);
            f2Var.f91366f = openUserData;
            return f2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/p2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/p2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class f3 extends vq.k implements er.q<id4.p2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91368e;

        f3(tq.e<? super f3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91368e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.m2 m2Var = id4.i.m2.f91710a;
                this.f91368e = 1;
                if (e4Var.F(m2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.p2 p2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new f3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/f2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/f2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<id4.f2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91370e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91370e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.c2 c2Var = id4.i.c2.f91654a;
                this.f91370e = 1;
                if (e4Var.F(c2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.f2 f2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/i3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/i3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<OpenTravelAbroadCountryDetails, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91373f;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenTravelAbroadCountryDetails openTravelAbroadCountryDetails = (OpenTravelAbroadCountryDetails) this.f91373f;
            Object objE = uq.b.e();
            int i15 = this.f91372e;
            if (i15 == 0) {
                oq.u.b(obj);
                String messageId = openTravelAbroadCountryDetails.getMessageId();
                if (messageId != null) {
                    e4 e4Var = e4.this;
                    if (!openTravelAbroadCountryDetails.getMessageDisplayed()) {
                        e4Var.y9(messageId);
                    }
                }
                e4 e4Var2 = e4.this;
                id4.i.ToTravelAbroadCountryDetails toTravelAbroadCountryDetails = new id4.i.ToTravelAbroadCountryDetails(openTravelAbroadCountryDetails.getCountryIso());
                this.f91373f = vq.j.a(openTravelAbroadCountryDetails);
                this.f91372e = 1;
                if (e4Var2.F(toTravelAbroadCountryDetails, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenTravelAbroadCountryDetails openTravelAbroadCountryDetails, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            g0 g0Var = e4.this.new g0(eVar);
            g0Var.f91373f = openTravelAbroadCountryDetails;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/o;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/o;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class g1 extends vq.k implements er.q<id4.o, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91375e;

        g1(tq.e<? super g1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91375e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.j jVar = id4.i.j.f91688a;
                this.f91375e = 1;
                if (e4Var.F(jVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.o oVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new g1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/v;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/v;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class g2 extends vq.k implements er.q<OpenApplicationLockGlobalEvent, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f91377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f91378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f91379g;

        g2(tq.e<? super g2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l74.b bVar;
            OpenApplicationLockGlobalEvent openApplicationLockGlobalEvent = (OpenApplicationLockGlobalEvent) this.f91379g;
            Object objE = uq.b.e();
            int i15 = this.f91378f;
            if (i15 == 0) {
                oq.u.b(obj);
                l74.a event = openApplicationLockGlobalEvent.getEvent();
                if (fr.t.c(event, l74.a.C2827a.f116925a)) {
                    bVar = l74.b.INSTITUTION_PIN;
                } else {
                    if (!fr.t.c(event, l74.a.b.f116926a)) {
                        throw new oq.p();
                    }
                    bVar = l74.b.LOGIN;
                }
                e4 e4Var = e4.this;
                id4.i.ToApplicationLockGlobalEvent toApplicationLockGlobalEvent = new id4.i.ToApplicationLockGlobalEvent(bVar);
                this.f91379g = vq.j.a(openApplicationLockGlobalEvent);
                this.f91377e = vq.j.a(bVar);
                this.f91378f = 1;
                if (e4Var.F(toApplicationLockGlobalEvent, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenApplicationLockGlobalEvent openApplicationLockGlobalEvent, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            g2 g2Var = e4.this.new g2(eVar);
            g2Var.f91379g = openApplicationLockGlobalEvent;
            return g2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/a2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/a2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class g3 extends vq.k implements er.q<id4.a2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91381e;

        g3(tq.e<? super g3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91381e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.x1 x1Var = id4.i.x1.f91760a;
                this.f91381e = 1;
                if (e4Var.F(x1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.a2 a2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new g3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/e0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/e0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<id4.e0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91383e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91383e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.z zVar = id4.i.z.f91766a;
                this.f91383e = 1;
                if (e4Var.F(zVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.e0 e0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/n3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/n3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<id4.n3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91385e;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91385e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.k3 k3Var = id4.i.k3.f91700a;
                this.f91385e = 1;
                if (e4Var.F(k3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.n3 n3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new h0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/k3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/k3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class h1 extends vq.k implements er.q<id4.k3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91387e;

        h1(tq.e<? super h1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91387e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.h3 h3Var = id4.i.h3.f91682a;
                this.f91387e = 1;
                if (e4Var.F(h3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.k3 k3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new h1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/w0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/w0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class h2 extends vq.k implements er.q<id4.w0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91389e;

        h2(tq.e<? super h2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91389e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.r0 r0Var = id4.i.r0.f91733a;
                this.f91389e = 1;
                if (e4Var.F(r0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.w0 w0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new h2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/y1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/y1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class h3 extends vq.k implements er.q<id4.y1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91391e;

        h3(tq.e<? super h3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91391e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.v1 v1Var = id4.i.v1.f91752a;
                this.f91391e = 1;
                if (e4Var.F(v1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.y1 y1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new h3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/r2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/r2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<id4.r2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91393e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91393e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.o2 o2Var = id4.i.o2.f91720a;
                this.f91393e = 1;
                if (e4Var.F(o2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.r2 r2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/f;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/f;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<Login, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f91395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f91396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f91397g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jj2.a aVar;
            jj2.a toCountryDetailsTravelAbroad;
            Login login = (Login) this.f91397g;
            Object objE = uq.b.e();
            int i15 = this.f91396f;
            if (i15 == 0) {
                oq.u.b(obj);
                tj2.b.ToLogin.AbstractC4973a redirection = login.getRedirection();
                if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.Default) {
                    aVar = jj2.a.b.f103434a;
                } else {
                    if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.DefaultWithLocalNotificationRedirection) {
                        toCountryDetailsTravelAbroad = new jj2.a.DefaultWithLocalNotification(((tj2.b.ToLogin.AbstractC4973a.DefaultWithLocalNotificationRedirection) redirection).getLocalNotificationItem());
                    } else if (fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.e.f190504b)) {
                        aVar = jj2.a.e.f103437a;
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.Verification) {
                        toCountryDetailsTravelAbroad = new jj2.a.Verification(((tj2.b.ToLogin.AbstractC4973a.Verification) redirection).getQrCode());
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.AuthConfirmation) {
                        toCountryDetailsTravelAbroad = new jj2.a.AuthNotification(((tj2.b.ToLogin.AbstractC4973a.AuthConfirmation) redirection).getData());
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.DefaultNotificationDetails) {
                        toCountryDetailsTravelAbroad = new jj2.a.DefaultNotificationDetails(((tj2.b.ToLogin.AbstractC4973a.DefaultNotificationDetails) redirection).getData());
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.ToInstantPaymentsDetails) {
                        toCountryDetailsTravelAbroad = new jj2.a.ToInstantPaymentsDetailsNotification(((tj2.b.ToLogin.AbstractC4973a.ToInstantPaymentsDetails) redirection).getData());
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.ToQualifiedSignatureIdentityConfirmation) {
                        toCountryDetailsTravelAbroad = new jj2.a.ToQualifiedSignatureIdentityConfirmation(((tj2.b.ToLogin.AbstractC4973a.ToQualifiedSignatureIdentityConfirmation) redirection).getToken());
                    } else if (redirection instanceof tj2.b.ToLogin.AbstractC4973a.ToTravelAbroadCountryDetails) {
                        tj2.b.ToLogin.AbstractC4973a.ToTravelAbroadCountryDetails toTravelAbroadCountryDetails = (tj2.b.ToLogin.AbstractC4973a.ToTravelAbroadCountryDetails) redirection;
                        toCountryDetailsTravelAbroad = new jj2.a.ToCountryDetailsTravelAbroad(toTravelAbroadCountryDetails.getCountryIso(), toTravelAbroadCountryDetails.getMessageId(), toTravelAbroadCountryDetails.getMessageDisplayed());
                    } else if (fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.m.f190514b)) {
                        aVar = jj2.a.m.f103447a;
                    } else if (fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.f.f190505b)) {
                        aVar = jj2.a.g.f103441a;
                    } else if (fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.h.f190507b)) {
                        aVar = jj2.a.i.f103443a;
                    } else if (fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.i.f190508b)) {
                        aVar = jj2.a.j.f103444a;
                    } else {
                        if (!fr.t.c(redirection, tj2.b.ToLogin.AbstractC4973a.j.f190509b)) {
                            throw new oq.p();
                        }
                        aVar = jj2.a.k.f103445a;
                    }
                    aVar = toCountryDetailsTravelAbroad;
                }
                e4 e4Var = e4.this;
                id4.i.Login login2 = new id4.i.Login(aVar, login.getRedirection().getClearProcesses() ? rh2.a.EnumC4442a.CLEAR_BACKSTACK_AND_CREATE_NEW : rh2.a.EnumC4442a.CREATE_NEW);
                this.f91397g = vq.j.a(login);
                this.f91395e = vq.j.a(aVar);
                this.f91396f = 1;
                if (e4Var.F(login2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Login login, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            i0 i0Var = e4.this.new i0(eVar);
            i0Var.f91397g = login;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/n0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/n0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class i1 extends vq.k implements er.q<id4.n0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91399e;

        i1(tq.e<? super i1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91399e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.i0 i0Var = id4.i.i0.f91684a;
                this.f91399e = 1;
                if (e4Var.F(i0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.n0 n0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new i1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/v1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/v1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class i2 extends vq.k implements er.q<id4.v1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91401e;

        i2(tq.e<? super i2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91401e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.s1 s1Var = id4.i.s1.f91738a;
                this.f91401e = 1;
                if (e4Var.F(s1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.v1 v1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new i2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/u;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/u;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class i3 extends vq.k implements er.q<id4.u, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91403e;

        i3(tq.e<? super i3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91403e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.p pVar = id4.i.p.f91722a;
                this.f91403e = 1;
                if (e4Var.F(pVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.u uVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new i3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/n1;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/n1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<OpenIdentityConfirmation, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91406f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cz2.a deeplink;
            OpenIdentityConfirmation openIdentityConfirmation = (OpenIdentityConfirmation) this.f91406f;
            Object objE = uq.b.e();
            int i15 = this.f91405e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                wy2.c.ToIdentityConfirmation.InterfaceC5735a entryPoint = openIdentityConfirmation.getEntryPoint();
                if (entryPoint instanceof wy2.c.ToIdentityConfirmation.InterfaceC5735a.Deeplink) {
                    deeplink = new cz2.a.Deeplink(((wy2.c.ToIdentityConfirmation.InterfaceC5735a.Deeplink) entryPoint).getToken());
                } else {
                    if (!fr.t.c(entryPoint, wy2.c.ToIdentityConfirmation.InterfaceC5735a.b.f215978a)) {
                        throw new oq.p();
                    }
                    deeplink = cz2.a.c.f38820a;
                }
                id4.i.ToIdentityConfirmation toIdentityConfirmation = new id4.i.ToIdentityConfirmation(deeplink);
                this.f91406f = vq.j.a(openIdentityConfirmation);
                this.f91405e = 1;
                if (e4Var.F(toIdentityConfirmation, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenIdentityConfirmation openIdentityConfirmation, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            j jVar = e4.this.new j(eVar);
            jVar.f91406f = openIdentityConfirmation;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/j;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/j;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<id4.j, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91408e;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f91408e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4.this.globalEventManager.c(new po2.a.ToOnboarding(false, true, true, 1, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.j jVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new j0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/q2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/q2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class j1 extends vq.k implements er.q<id4.q2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91410e;

        j1(tq.e<? super j1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91410e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.n2 n2Var = id4.i.n2.f91715a;
                this.f91410e = 1;
                if (e4Var.F(n2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.q2 q2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new j1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/x0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/x0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class j2 extends vq.k implements er.q<id4.x0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91412e;

        j2(tq.e<? super j2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91412e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.s0 s0Var = id4.i.s0.f91737a;
                this.f91412e = 1;
                if (e4Var.F(s0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.x0 x0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new j2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/d1;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/d1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class j3 extends vq.k implements er.q<OpenGenericApplicationForms, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91415f;

        j3(tq.e<? super j3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenGenericApplicationForms openGenericApplicationForms = (OpenGenericApplicationForms) this.f91415f;
            Object objE = uq.b.e();
            int i15 = this.f91414e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToGenericApplicationForms toGenericApplicationForms = new id4.i.ToGenericApplicationForms(openGenericApplicationForms.getData());
                this.f91415f = vq.j.a(openGenericApplicationForms);
                this.f91414e = 1;
                if (e4Var.F(toGenericApplicationForms, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenGenericApplicationForms openGenericApplicationForms, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            j3 j3Var = e4.this.new j3(eVar);
            j3Var.f91415f = openGenericApplicationForms;
            return j3Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/m0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/m0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<id4.m0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91417e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91417e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.h0 h0Var = id4.i.h0.f91679a;
                this.f91417e = 1;
                if (e4Var.F(h0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.m0 m0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/o0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/o0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<id4.o0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91419e;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91419e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (e4.this.developerSettingsManager.getIsAvailable()) {
                    e4 e4Var = e4.this;
                    id4.i.j0 j0Var = id4.i.j0.f91689a;
                    this.f91419e = 1;
                    if (e4Var.F(j0Var, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.o0 o0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new k0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/u2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/u2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class k1 extends vq.k implements er.q<id4.u2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91421e;

        k1(tq.e<? super k1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91421e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.r2 r2Var = id4.i.r2.f91735a;
                this.f91421e = 1;
                if (e4Var.F(r2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.u2 u2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new k1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/t3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/t3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class k2 extends vq.k implements er.q<id4.t3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91423e;

        k2(tq.e<? super k2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91423e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.q3 q3Var = id4.i.q3.f91731a;
                this.f91423e = 1;
                if (e4Var.F(q3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.t3 t3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new k2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/g2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/g2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class k3 extends vq.k implements er.q<OpenPassportInvalidation, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91426f;

        k3(tq.e<? super k3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenPassportInvalidation openPassportInvalidation = (OpenPassportInvalidation) this.f91426f;
            Object objE = uq.b.e();
            int i15 = this.f91425e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToPassportInvalidation toPassportInvalidation = new id4.i.ToPassportInvalidation(openPassportInvalidation.getPassportNumber());
                this.f91426f = vq.j.a(openPassportInvalidation);
                this.f91425e = 1;
                if (e4Var.F(toPassportInvalidation, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenPassportInvalidation openPassportInvalidation, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            k3 k3Var = e4.this.new k3(eVar);
            k3Var.f91426f = openPassportInvalidation;
            return k3Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/r1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/r1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<id4.r1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91428e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91428e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.n1 n1Var = id4.i.n1.f91714a;
                this.f91428e = 1;
                if (e4Var.F(n1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.r1 r1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/e1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/e1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.q<id4.e1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91430e;

        l0(tq.e<? super l0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91430e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.z0 z0Var = id4.i.z0.f91767a;
                this.f91430e = 1;
                if (e4Var.F(z0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.e1 e1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new l0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/m3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/m3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class l1 extends vq.k implements er.q<OpenVehicleHistory, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91433f;

        l1(tq.e<? super l1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenVehicleHistory openVehicleHistory = (OpenVehicleHistory) this.f91433f;
            Object objE = uq.b.e();
            int i15 = this.f91432e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToVehicleHistory toVehicleHistory = new id4.i.ToVehicleHistory(openVehicleHistory.getVin(), openVehicleHistory.getPlate(), openVehicleHistory.getSkipForm(), openVehicleHistory.getFirstRegistrationDate());
                this.f91433f = vq.j.a(openVehicleHistory);
                this.f91432e = 1;
                if (e4Var.F(toVehicleHistory, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenVehicleHistory openVehicleHistory, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            l1 l1Var = e4.this.new l1(eVar);
            l1Var.f91433f = openVehicleHistory;
            return l1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/p;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/p;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class l2 extends vq.k implements er.q<id4.p, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91435e;

        l2(tq.e<? super l2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91435e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.k kVar = id4.i.k.f91696a;
                this.f91435e = 1;
                if (e4Var.F(kVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.p pVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new l2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/b0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/b0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class l3 extends vq.k implements er.q<id4.b0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91437e;

        l3(tq.e<? super l3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91437e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.w wVar = id4.i.w.f91754a;
                this.f91437e = 1;
                if (e4Var.F(wVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.b0 b0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new l3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/a0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/a0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<id4.a0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91439e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91439e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.v vVar = id4.i.v.f91750a;
                this.f91439e = 1;
                if (e4Var.F(vVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.a0 a0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/i2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/i2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<OpenPayments, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91442f;

        m0(tq.e<? super m0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenPayments openPayments = (OpenPayments) this.f91442f;
            Object objE = uq.b.e();
            int i15 = this.f91441e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToPayments toPayments = new id4.i.ToPayments(openPayments.getEvent());
                this.f91442f = vq.j.a(openPayments);
                this.f91441e = 1;
                if (e4Var.F(toPayments, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenPayments openPayments, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            m0 m0Var = e4.this.new m0(eVar);
            m0Var.f91442f = openPayments;
            return m0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/t1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/t1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class m1 extends vq.k implements er.q<id4.t1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91444e;

        m1(tq.e<? super m1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91444e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.q1 q1Var = id4.i.q1.f91729a;
                this.f91444e = 1;
                if (e4Var.F(q1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.t1 t1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new m1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/b1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/b1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class m2 extends vq.k implements er.q<id4.b1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91446e;

        m2(tq.e<? super m2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91446e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.w0 w0Var = id4.i.w0.f91755a;
                this.f91446e = 1;
                if (e4Var.F(w0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.b1 b1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new m2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/u3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/u3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class m3 extends vq.k implements er.q<id4.u3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91448e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f91450e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e4 f91451f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4 e4Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f91451f = e4Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                if (r9 == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r8.f91450e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r9)
                    goto L47
                L12:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1a:
                    oq.u.b(r9)
                    goto L32
                L1e:
                    oq.u.b(r9)
                    id4.e4 r9 = r8.f91451f
                    v64.q r9 = id4.e4.q9(r9)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r8.f91450e = r3
                    java.lang.Object r9 = r9.c(r1, r8)
                    if (r9 != r0) goto L32
                    goto L46
                L32:
                    id4.e4 r9 = r8.f91451f
                    a14.q r9 = id4.e4.p9(r9)
                    a14.q$a r1 = new a14.q$a
                    r3 = 0
                    r1.<init>(r3)
                    r8.f91450e = r2
                    java.lang.Object r9 = r9.c(r1, r8)
                    if (r9 != r0) goto L47
                L46:
                    return r0
                L47:
                    dx.i r9 = (dx.i) r9
                    id4.e4 r0 = r8.f91451f
                    boolean r1 = r9 instanceof dx.i.Left
                    if (r1 == 0) goto L6d
                    dx.i$b r9 = (dx.i.Left) r9
                    java.lang.Object r9 = r9.b()
                    dx.b$c r9 = (dx.b.Business) r9
                    i70.e r0 = id4.e4.o9(r0)
                    p50.a$b r1 = new p50.a$b
                    mx.a r2 = r9.getMessage()
                    r6 = 14
                    r7 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r0.y(r1)
                L6d:
                    oq.i0 r9 = oq.i0.f148189a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: id4.e4.m3.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f91451f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        m3(tq.e<? super m3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f91448e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4 e4Var = e4.this;
            i00.a.a(e4Var, new a(e4Var, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.u3 u3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new m3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/c0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/c0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<id4.c0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91452e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91452e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.x xVar = id4.i.x.f91758a;
                this.f91452e = 1;
                if (e4Var.F(xVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.c0 c0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/p0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/p0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<id4.p0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91454e;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91454e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.k0 k0Var = id4.i.k0.f91697a;
                this.f91454e = 1;
                if (e4Var.F(k0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.p0 p0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new n0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/b2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/b2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class n1 extends vq.k implements er.q<OpenNotification, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91457f;

        n1(tq.e<? super n1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenNotification openNotification = (OpenNotification) this.f91457f;
            Object objE = uq.b.e();
            int i15 = this.f91456e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToNotification toNotification = new id4.i.ToNotification(openNotification.getDestination());
                this.f91457f = vq.j.a(openNotification);
                this.f91456e = 1;
                if (e4Var.F(toNotification, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenNotification openNotification, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            n1 n1Var = e4.this.new n1(eVar);
            n1Var.f91457f = openNotification;
            return n1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/s1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/s1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class n2 extends vq.k implements er.q<id4.s1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91459e;

        n2(tq.e<? super n2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91459e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.p1 p1Var = id4.i.p1.f91724a;
                this.f91459e = 1;
                if (e4Var.F(p1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.s1 s1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new n2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/d;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/d;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class n3 extends vq.k implements er.q<GoToStore, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91462f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f91464e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e4 f91465f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ GoToStore f91466g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4 e4Var, GoToStore goToStore, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f91465f = e4Var;
                this.f91466g = goToStore;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f91464e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a14.q qVar = this.f91465f.goToStoreIntentUseCase;
                    a14.q.Params params = new a14.q.Params(this.f91466g.getPackageName());
                    this.f91464e = 1;
                    obj = qVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                e4 e4Var = this.f91465f;
                if (iVar instanceof dx.i.Left) {
                    e4Var.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f91465f, this.f91466g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        n3(tq.e<? super n3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToStore goToStore = (GoToStore) this.f91462f;
            uq.b.e();
            if (this.f91461e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4 e4Var = e4.this;
            i00.a.a(e4Var, new a(e4Var, goToStore, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToStore goToStore, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            n3 n3Var = e4.this.new n3(eVar);
            n3Var.f91462f = goToStore;
            return n3Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/q3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/q3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<id4.q3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91467e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91467e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.n3 n3Var = id4.i.n3.f91716a;
                this.f91467e = 1;
                if (e4Var.F(n3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.q3 q3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/s0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/s0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.q<OpenDrivingLicence, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91470f;

        o0(tq.e<? super o0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDrivingLicence openDrivingLicence = (OpenDrivingLicence) this.f91470f;
            Object objE = uq.b.e();
            int i15 = this.f91469e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToDrivingLicence toDrivingLicence = new id4.i.ToDrivingLicence(openDrivingLicence.getEvent() instanceof ju1.a.b);
                this.f91470f = vq.j.a(openDrivingLicence);
                this.f91469e = 1;
                if (e4Var.F(toDrivingLicence, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDrivingLicence openDrivingLicence, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            o0 o0Var = e4.this.new o0(eVar);
            o0Var.f91470f = openDrivingLicence;
            return o0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/z;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/z;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class o1 extends vq.k implements er.q<id4.z, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91472e;

        o1(tq.e<? super o1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91472e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.u uVar = id4.i.u.f91744a;
                this.f91472e = 1;
                if (e4Var.F(uVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.z zVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new o1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/k;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/k;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class o2 extends vq.k implements er.q<id4.k, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91474e;

        o2(tq.e<? super o2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91474e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.f fVar = id4.i.f.f91667a;
                this.f91474e = 1;
                if (e4Var.F(fVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.k kVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new o2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/g;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/g;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class o3 extends vq.k implements er.q<id4.g, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91476e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f91478e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e4 f91479f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4 e4Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f91479f = e4Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f91478e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v64.q qVar = this.f91479f.logoutUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f91478e = 1;
                    if (qVar.c(c1792a, this) == objE) {
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

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f91479f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        o3(tq.e<? super o3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f91476e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4 e4Var = e4.this;
            i00.a.a(e4Var, new a(e4Var, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.g gVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new o3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/g1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/g1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<id4.g1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91480e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91480e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.b1 b1Var = id4.i.b1.f91648a;
                this.f91480e = 1;
                if (e4Var.F(b1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.g1 g1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/l;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/l;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.q<OpenAddDocument, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91483f;

        p0(tq.e<? super p0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenAddDocument openAddDocument = (OpenAddDocument) this.f91483f;
            Object objE = uq.b.e();
            int i15 = this.f91482e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToAddDocument toAddDocument = new id4.i.ToAddDocument(openAddDocument.getEvent());
                this.f91483f = vq.j.a(openAddDocument);
                this.f91482e = 1;
                if (e4Var.F(toAddDocument, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenAddDocument openAddDocument, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            p0 p0Var = e4.this.new p0(eVar);
            p0Var.f91483f = openAddDocument;
            return p0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/s3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/s3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class p1 extends vq.k implements er.q<OpenWruDocument, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91486f;

        p1(tq.e<? super p1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenWruDocument openWruDocument = (OpenWruDocument) this.f91486f;
            Object objE = uq.b.e();
            int i15 = this.f91485e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToWruDocument toWruDocument = new id4.i.ToWruDocument(openWruDocument.getLicenceCode());
                this.f91486f = vq.j.a(openWruDocument);
                this.f91485e = 1;
                if (e4Var.F(toWruDocument, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenWruDocument openWruDocument, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            p1 p1Var = e4.this.new p1(eVar);
            p1Var.f91486f = openWruDocument;
            return p1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/h1;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/h1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class p2 extends vq.k implements er.q<OpenHistory, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91489f;

        p2(tq.e<? super p2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenHistory openHistory = (OpenHistory) this.f91489f;
            Object objE = uq.b.e();
            int i15 = this.f91488e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToHistory toHistory = new id4.i.ToHistory(openHistory.getExcludeItems());
                this.f91489f = vq.j.a(openHistory);
                this.f91488e = 1;
                if (e4Var.F(toHistory, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenHistory openHistory, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            p2 p2Var = e4.this.new p2(eVar);
            p2Var.f91489f = openHistory;
            return p2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/w3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/w3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class p3 extends vq.k implements er.q<id4.w3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91491e;

        p3(tq.e<? super p3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91491e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.c cVar = id4.i.c.f91651a;
                this.f91491e = 1;
                if (e4Var.F(cVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.w3 w3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new p3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/z1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/z1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<id4.z1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91493e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91493e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.w1 w1Var = id4.i.w1.f91756a;
                this.f91493e = 1;
                if (e4Var.F(w1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.z1 z1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/c;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/c;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class q0 extends vq.k implements er.q<id4.c, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91495e;

        q0(tq.e<? super q0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91495e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToHome toHome = new id4.i.ToHome(e4.this.isUserLoggedInUseCase.a(gz.b.a.C1792a.f78542a).booleanValue());
                this.f91495e = 1;
                if (e4Var.F(toHome, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.c cVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new q0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/i1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/i1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class q1 extends vq.k implements er.q<id4.i1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91497e;

        q1(tq.e<? super q1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91497e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.e1 e1Var = id4.i.e1.f91664a;
                this.f91497e = 1;
                if (e4Var.F(e1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.i1 i1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new q1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/y;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/y;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class q2 extends vq.k implements er.q<id4.y, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91499e;

        q2(tq.e<? super q2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91499e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.t tVar = id4.i.t.f91740a;
                this.f91499e = 1;
                if (e4Var.F(tVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.y yVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new q2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/c1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/c1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class q3 extends vq.k implements er.q<id4.c1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91501e;

        q3(tq.e<? super q3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91501e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.x0 x0Var = id4.i.x0.f91759a;
                this.f91501e = 1;
                if (e4Var.F(x0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.c1 c1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new q3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/o1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/o1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<id4.o1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91503e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91503e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.k1 k1Var = id4.i.k1.f91698a;
                this.f91503e = 1;
                if (e4Var.F(k1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.o1 o1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/t0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/t0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class r0 extends vq.k implements er.q<OpenDynamicDocument, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91506f;

        r0(tq.e<? super r0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDynamicDocument openDynamicDocument = (OpenDynamicDocument) this.f91506f;
            Object objE = uq.b.e();
            int i15 = this.f91505e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToDynamicDocument toDynamicDocument = new id4.i.ToDynamicDocument(openDynamicDocument.getDynamicDocumentType());
                this.f91506f = vq.j.a(openDynamicDocument);
                this.f91505e = 1;
                if (e4Var.F(toDynamicDocument, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDynamicDocument openDynamicDocument, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            r0 r0Var = e4.this.new r0(eVar);
            r0Var.f91506f = openDynamicDocument;
            return r0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/w;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/w;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class r1 extends vq.k implements er.q<id4.w, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91508e;

        r1(tq.e<? super r1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91508e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.r rVar = id4.i.r.f91732a;
                this.f91508e = 1;
                if (e4Var.F(rVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.w wVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new r1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/m2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/m2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class r2 extends vq.k implements er.q<id4.m2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91510e;

        r2(tq.e<? super r2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91510e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.j2 j2Var = id4.i.j2.f91691a;
                this.f91510e = 1;
                if (e4Var.F(j2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.m2 m2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new r2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/m1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/m1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class r3 extends vq.k implements er.q<id4.m1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91512e;

        r3(tq.e<? super r3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91512e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.i1 i1Var = id4.i.i1.f91685a;
                this.f91512e = 1;
                if (e4Var.F(i1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.m1 m1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new r3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/v2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/v2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<id4.v2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91514e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91514e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.s2 s2Var = id4.i.s2.f91739a;
                this.f91514e = 1;
                if (e4Var.F(s2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.v2 v2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/u0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/u0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class s0 extends vq.k implements er.q<OpenDynamicMultiDocument, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91517f;

        s0(tq.e<? super s0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDynamicMultiDocument openDynamicMultiDocument = (OpenDynamicMultiDocument) this.f91517f;
            Object objE = uq.b.e();
            int i15 = this.f91516e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToDynamicMultiDocument toDynamicMultiDocument = new id4.i.ToDynamicMultiDocument(openDynamicMultiDocument.getDynamicMultiDocumentType());
                this.f91517f = vq.j.a(openDynamicMultiDocument);
                this.f91516e = 1;
                if (e4Var.F(toDynamicMultiDocument, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDynamicMultiDocument openDynamicMultiDocument, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            s0 s0Var = e4.this.new s0(eVar);
            s0Var.f91517f = openDynamicMultiDocument;
            return s0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/w1;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/w1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class s1 extends vq.k implements er.q<OpenMakeProposalService, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91520f;

        s1(tq.e<? super s1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenMakeProposalService openMakeProposalService = (OpenMakeProposalService) this.f91520f;
            Object objE = uq.b.e();
            int i15 = this.f91519e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToMakeProposalService toMakeProposalService = new id4.i.ToMakeProposalService(openMakeProposalService.getSupplementOrigin());
                this.f91520f = vq.j.a(openMakeProposalService);
                this.f91519e = 1;
                if (e4Var.F(toMakeProposalService, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenMakeProposalService openMakeProposalService, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            s1 s1Var = e4.this.new s1(eVar);
            s1Var.f91520f = openMakeProposalService;
            return s1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/x1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/x1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class s2 extends vq.k implements er.q<id4.x1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91522e;

        s2(tq.e<? super s2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91522e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.u1 u1Var = id4.i.u1.f91746a;
                this.f91522e = 1;
                if (e4Var.F(u1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.x1 x1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new s2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/j1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/j1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class s3 extends vq.k implements er.q<id4.j1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91524e;

        s3(tq.e<? super s3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91524e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.f1 f1Var = id4.i.f1.f91670a;
                this.f91524e = 1;
                if (e4Var.F(f1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.j1 j1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new s3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/h2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/h2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<id4.h2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91526e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91526e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.e2 e2Var = id4.i.e2.f91665a;
                this.f91526e = 1;
                if (e4Var.F(e2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.h2 h2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/m;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/m;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class t0 extends vq.k implements er.q<OpenAddJuniorSchoolCard, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91529f;

        t0(tq.e<? super t0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenAddJuniorSchoolCard openAddJuniorSchoolCard = (OpenAddJuniorSchoolCard) this.f91529f;
            Object objE = uq.b.e();
            int i15 = this.f91528e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToAddJuniorSchoolCard toAddJuniorSchoolCard = new id4.i.ToAddJuniorSchoolCard(openAddJuniorSchoolCard.getFromDynamicDocumentsList());
                this.f91529f = vq.j.a(openAddJuniorSchoolCard);
                this.f91528e = 1;
                if (e4Var.F(toAddJuniorSchoolCard, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenAddJuniorSchoolCard openAddJuniorSchoolCard, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            t0 t0Var = e4.this.new t0(eVar);
            t0Var.f91529f = openAddJuniorSchoolCard;
            return t0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/i0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/i0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class t1 extends vq.k implements er.q<id4.i0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91531e;

        t1(tq.e<? super t1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91531e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.d0 d0Var = id4.i.d0.f91657a;
                this.f91531e = 1;
                if (e4Var.F(d0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.i0 i0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new t1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/y3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/y3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class t2 extends vq.k implements er.q<ShowSnackbarEvent, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91534f;

        t2(tq.e<? super t2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowSnackbarEvent showSnackbarEvent = (ShowSnackbarEvent) this.f91534f;
            uq.b.e();
            if (this.f91533e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4.this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(showSnackbarEvent.getMessage(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowSnackbarEvent showSnackbarEvent, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            t2 t2Var = e4.this.new t2(eVar);
            t2Var.f91534f = showSnackbarEvent;
            return t2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/l1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/l1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class t3 extends vq.k implements er.q<id4.l1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91536e;

        t3(tq.e<? super t3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91536e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.h1 h1Var = id4.i.h1.f91680a;
                this.f91536e = 1;
                if (e4Var.F(h1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.l1 l1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new t3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/q1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/q1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<id4.q1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91538e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91538e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.m1 m1Var = id4.i.m1.f91709a;
                this.f91538e = 1;
                if (e4Var.F(m1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.q1 q1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/z3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/z3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class u0 extends vq.k implements er.q<StudentCardActivated, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91541f;

        u0(tq.e<? super u0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            StudentCardActivated studentCardActivated = (StudentCardActivated) this.f91541f;
            Object objE = uq.b.e();
            int i15 = this.f91540e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.StudentCardActivated studentCardActivated2 = new id4.i.StudentCardActivated(studentCardActivated.getClearProcess());
                this.f91541f = vq.j.a(studentCardActivated);
                this.f91540e = 1;
                if (e4Var.F(studentCardActivated2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(StudentCardActivated studentCardActivated, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            u0 u0Var = e4.this.new u0(eVar);
            u0Var.f91541f = studentCardActivated;
            return u0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/j2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/j2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class u1 extends vq.k implements er.q<id4.j2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91543e;

        u1(tq.e<? super u1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91543e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.g2 g2Var = id4.i.g2.f91676a;
                this.f91543e = 1;
                if (e4Var.F(g2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.j2 j2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new u1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/c2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/c2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class u2 extends vq.k implements er.q<id4.c2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91545e;

        u2(tq.e<? super u2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91545e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.z1 z1Var = id4.i.z1.f91768a;
                this.f91545e = 1;
                if (e4Var.F(z1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.c2 c2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new u2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/b;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/b;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class u3 extends vq.k implements er.q<DeleteCert, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91548f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f91550e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e4 f91551f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ DeleteCert f91552g;

            /* JADX INFO: renamed from: id4.e4$u3$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C2174a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f91553a;

                static {
                    int[] iArr = new int[k34.u.values().length];
                    try {
                        iArr[k34.u.MOBYWATEL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k34.u.DIIA.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k34.u.STUDENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f91553a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4 e4Var, DeleteCert deleteCert, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f91551f = e4Var;
                this.f91552g = deleteCert;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
            
                if (r7.c(r1, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
            
                if (r7.c(r1, r6) == r0) goto L27;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f91550e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    oq.u.b(r7)
                    goto L87
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    oq.u.b(r7)
                    goto L89
                L1f:
                    oq.u.b(r7)
                    id4.e4 r7 = r6.f91551f
                    c54.b r7 = id4.e4.u9(r7)
                    b54.c r1 = b54.c.MOB_DB_CONTAINERS
                    java.lang.Object r7 = r7.a(r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 == 0) goto L6d
                    id4.e4 r7 = r6.f91551f
                    w24.k r7 = id4.e4.i9(r7)
                    w24.k$a r1 = new w24.k$a
                    id4.b r4 = r6.f91552g
                    k34.u r4 = r4.getIdentityType()
                    int[] r5 = id4.e4.u3.a.C2174a.f91553a
                    int r4 = r4.ordinal()
                    r4 = r5[r4]
                    if (r4 == r3) goto L5f
                    if (r4 == r2) goto L5c
                    r2 = 3
                    if (r4 != r2) goto L56
                    f24.c r2 = f24.c.UNIVERSITY
                    goto L61
                L56:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                L5c:
                    f24.c r2 = f24.c.REFUGEE
                    goto L61
                L5f:
                    f24.c r2 = f24.c.CITIZEN
                L61:
                    r1.<init>(r2)
                    r6.f91550e = r3
                    java.lang.Object r7 = r7.c(r1, r6)
                    if (r7 != r0) goto L89
                    goto L86
                L6d:
                    id4.e4 r7 = r6.f91551f
                    q34.v r7 = id4.e4.j9(r7)
                    q34.v$a r1 = new q34.v$a
                    id4.b r3 = r6.f91552g
                    k34.u r3 = r3.getIdentityType()
                    r1.<init>(r3)
                    r6.f91550e = r2
                    java.lang.Object r7 = r7.c(r1, r6)
                    if (r7 != r0) goto L87
                L86:
                    return r0
                L87:
                    oq.i0 r7 = oq.i0.f148189a
                L89:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: id4.e4.u3.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f91551f, this.f91552g, eVar);
            }
        }

        u3(tq.e<? super u3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DeleteCert deleteCert = (DeleteCert) this.f91548f;
            Object objE = uq.b.e();
            int i15 = this.f91547e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.d dVar = e4.this.dispatcherProvider;
                a aVar = new a(e4.this, deleteCert, null);
                this.f91548f = vq.j.a(deleteCert);
                this.f91547e = 1;
                if (dVar.a(aVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(DeleteCert deleteCert, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            u3 u3Var = e4.this.new u3(eVar);
            u3Var.f91548f = deleteCert;
            return u3Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/h3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/h3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<id4.h3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91554e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91554e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.e3 e3Var = id4.i.e3.f91666a;
                this.f91554e = 1;
                if (e4Var.F(e3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.h3 h3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/n;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/n;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class v0 extends vq.k implements er.q<id4.n, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91556e;

        v0(tq.e<? super v0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91556e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.C2175i c2175i = id4.i.C2175i.f91683a;
                this.f91556e = 1;
                if (e4Var.F(c2175i, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.n nVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new v0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/o3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/o3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class v1 extends vq.k implements er.q<OpenVerificationGlobalEvent, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f91558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f91559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f91560g;

        v1(tq.e<? super v1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xd4.u dynamicDocument;
            OpenVerificationGlobalEvent openVerificationGlobalEvent = (OpenVerificationGlobalEvent) this.f91560g;
            Object objE = uq.b.e();
            int i15 = this.f91559f;
            if (i15 == 0) {
                oq.u.b(obj);
                wn3.x event = openVerificationGlobalEvent.getEvent();
                if (fr.t.c(event, wn3.d.f214210a)) {
                    dynamicDocument = xd4.a.f218058a;
                } else if (fr.t.c(event, wn3.e.f214211a)) {
                    dynamicDocument = xd4.b.f218061a;
                } else if (fr.t.c(event, wn3.f.f214212a)) {
                    dynamicDocument = xd4.c.f218063a;
                } else if (fr.t.c(event, wn3.g.f214213a)) {
                    dynamicDocument = xd4.d.f218065a;
                } else if (fr.t.c(event, wn3.h.f214214a)) {
                    dynamicDocument = xd4.e.f218067a;
                } else if (event instanceof FromFamilyCard) {
                    dynamicDocument = new xd4.h(((FromFamilyCard) openVerificationGlobalEvent.getEvent()).getId());
                } else if (fr.t.c(event, wn3.l.f214220a)) {
                    dynamicDocument = xd4.i.f218077a;
                } else if (fr.t.c(event, wn3.m.f214221a)) {
                    dynamicDocument = xd4.j.f218079a;
                } else if (fr.t.c(event, wn3.n.f214222a)) {
                    dynamicDocument = xd4.k.f218081a;
                } else if (fr.t.c(event, wn3.o.f214223a)) {
                    dynamicDocument = xd4.l.f218083a;
                } else if (event instanceof FromRailwayCard) {
                    dynamicDocument = new xd4.m(((FromRailwayCard) openVerificationGlobalEvent.getEvent()).getId());
                } else if (event instanceof FromRefugeeCard) {
                    dynamicDocument = new xd4.n(((FromRefugeeCard) openVerificationGlobalEvent.getEvent()).getBundleId());
                } else if (fr.t.c(event, wn3.r.f214226a)) {
                    dynamicDocument = xd4.p.f218091a;
                } else if (fr.t.c(event, wn3.s.f214227a)) {
                    dynamicDocument = xd4.q.f218093a;
                } else if (fr.t.c(event, wn3.t.f214228a)) {
                    dynamicDocument = xd4.r.f218095a;
                } else if (event instanceof FromWru) {
                    dynamicDocument = new xd4.t(((FromWru) openVerificationGlobalEvent.getEvent()).getLicenceType());
                } else if (fr.t.c(event, wn3.v.f214230a)) {
                    dynamicDocument = xd4.o.f218089a;
                } else if (event instanceof WithDeeplink) {
                    dynamicDocument = new xd4.s(((WithDeeplink) openVerificationGlobalEvent.getEvent()).getQrCode());
                } else if (event instanceof FromDynamicMultiDocument) {
                    dynamicDocument = new DynamicMultiDocument(((FromDynamicMultiDocument) openVerificationGlobalEvent.getEvent()).getDocumentId(), ((FromDynamicMultiDocument) openVerificationGlobalEvent.getEvent()).getDocumentType());
                } else {
                    if (!(event instanceof FromDynamicDocument)) {
                        throw new oq.p();
                    }
                    dynamicDocument = new DynamicDocument(((FromDynamicDocument) openVerificationGlobalEvent.getEvent()).getDocumentIID(), ((FromDynamicDocument) openVerificationGlobalEvent.getEvent()).getDocumentType());
                }
                e4 e4Var = e4.this;
                id4.i.ToVerificationGlobalEvent toVerificationGlobalEvent = new id4.i.ToVerificationGlobalEvent(dynamicDocument);
                this.f91560g = vq.j.a(openVerificationGlobalEvent);
                this.f91558e = vq.j.a(dynamicDocument);
                this.f91559f = 1;
                if (e4Var.F(toVerificationGlobalEvent, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenVerificationGlobalEvent openVerificationGlobalEvent, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            v1 v1Var = e4.this.new v1(eVar);
            v1Var.f91560g = openVerificationGlobalEvent;
            return v1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/x;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/x;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class v2 extends vq.k implements er.q<id4.x, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91562e;

        v2(tq.e<? super v2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91562e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.s sVar = id4.i.s.f91736a;
                this.f91562e = 1;
                if (e4Var.F(sVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.x xVar, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new v2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/r0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/r0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class v3 extends vq.k implements er.q<id4.r0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91564e;

        v3(tq.e<? super v3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91564e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.m0 m0Var = id4.i.m0.f91708a;
                this.f91564e = 1;
                if (e4Var.F(m0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.r0 r0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new v3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/a3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/a3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<id4.a3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91566e;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91566e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.x2 x2Var = id4.i.x2.f91761a;
                this.f91566e = 1;
                if (e4Var.F(x2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.a3 a3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new w(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/z0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/z0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class w0 extends vq.k implements er.q<OpenExtendStudentCardValidity, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91569f;

        w0(tq.e<? super w0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenExtendStudentCardValidity openExtendStudentCardValidity = (OpenExtendStudentCardValidity) this.f91569f;
            Object objE = uq.b.e();
            int i15 = this.f91568e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToExtendStudentCardValidity toExtendStudentCardValidity = new id4.i.ToExtendStudentCardValidity(openExtendStudentCardValidity.getClearProcess());
                this.f91569f = vq.j.a(openExtendStudentCardValidity);
                this.f91568e = 1;
                if (e4Var.F(toExtendStudentCardValidity, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenExtendStudentCardValidity openExtendStudentCardValidity, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            w0 w0Var = e4.this.new w0(eVar);
            w0Var.f91569f = openExtendStudentCardValidity;
            return w0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/f1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/f1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class w1 extends vq.k implements er.q<id4.f1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91571e;

        w1(tq.e<? super w1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91571e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.a1 a1Var = id4.i.a1.f91639a;
                this.f91571e = 1;
                if (e4Var.F(a1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.f1 f1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new w1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/j0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/j0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class w2 extends vq.k implements er.q<OpenDashboard, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91574f;

        w2(tq.e<? super w2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDashboard openDashboard = (OpenDashboard) this.f91574f;
            Object objE = uq.b.e();
            int i15 = this.f91573e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToDashboard toDashboard = new id4.i.ToDashboard(openDashboard.getClearProcess());
                this.f91574f = vq.j.a(openDashboard);
                this.f91573e = 1;
                if (e4Var.F(toDashboard, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDashboard openDashboard, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            w2 w2Var = e4.this.new w2(eVar);
            w2Var.f91574f = openDashboard;
            return w2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/q0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/q0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class w3 extends vq.k implements er.q<id4.q0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91576e;

        w3(tq.e<? super w3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91576e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.l0 l0Var = id4.i.l0.f91702a;
                this.f91576e = 1;
                if (e4Var.F(l0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.q0 q0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new w3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/v3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/v3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<id4.v3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91578e;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f91578e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4.this.restartApplicationManager.a();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.v3 v3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new x(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/k2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/k2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class x0 extends vq.k implements er.q<id4.k2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91580e;

        x0(tq.e<? super x0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91580e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.h2 h2Var = id4.i.h2.f91681a;
                this.f91580e = 1;
                if (e4Var.F(h2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.k2 k2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new x0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/d2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/d2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class x1 extends vq.k implements er.q<OpenOnboarding, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91583f;

        x1(tq.e<? super x1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenOnboarding openOnboarding = (OpenOnboarding) this.f91583f;
            Object objE = uq.b.e();
            int i15 = this.f91582e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToOnboarding toOnboarding = new id4.i.ToOnboarding(openOnboarding.getClearProcesses(), openOnboarding.getResetPassword(), openOnboarding.getShowAppNotActivatedDialog());
                this.f91583f = vq.j.a(openOnboarding);
                this.f91582e = 1;
                if (e4Var.F(toOnboarding, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenOnboarding openOnboarding, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            x1 x1Var = e4.this.new x1(eVar);
            x1Var.f91583f = openOnboarding;
            return x1Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/k0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/k0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class x2 extends vq.k implements er.q<OpenDashboardWithNotificationNavigation, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91586f;

        x2(tq.e<? super x2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenDashboardWithNotificationNavigation openDashboardWithNotificationNavigation = (OpenDashboardWithNotificationNavigation) this.f91586f;
            Object objE = uq.b.e();
            int i15 = this.f91585e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToDashboardWithNotificationNavigation toDashboardWithNotificationNavigation = new id4.i.ToDashboardWithNotificationNavigation(openDashboardWithNotificationNavigation.getClearProcess(), openDashboardWithNotificationNavigation.getLocalNotificationItem());
                this.f91586f = vq.j.a(openDashboardWithNotificationNavigation);
                this.f91585e = 1;
                if (e4Var.F(toDashboardWithNotificationNavigation, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenDashboardWithNotificationNavigation openDashboardWithNotificationNavigation, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            x2 x2Var = e4.this.new x2(eVar);
            x2Var.f91586f = openDashboardWithNotificationNavigation;
            return x2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/k1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/k1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class x3 extends vq.k implements er.q<id4.k1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91588e;

        x3(tq.e<? super x3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91588e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.g1 g1Var = id4.i.g1.f91675a;
                this.f91588e = 1;
                if (e4Var.F(g1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.k1 k1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new x3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/b3;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/b3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<OpenSchoolGrades, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91591f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolGrades openSchoolGrades = (OpenSchoolGrades) this.f91591f;
            Object objE = uq.b.e();
            int i15 = this.f91590e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolGrades toSchoolGrades = new id4.i.ToSchoolGrades(openSchoolGrades.getStudentId());
                this.f91591f = vq.j.a(openSchoolGrades);
                this.f91590e = 1;
                if (e4Var.F(toSchoolGrades, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolGrades openSchoolGrades, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            y yVar = e4.this.new y(eVar);
            yVar.f91591f = openSchoolGrades;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/a1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/a1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class y0 extends vq.k implements er.q<id4.a1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91593e;

        y0(tq.e<? super y0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91593e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.v0 v0Var = id4.i.v0.f91751a;
                this.f91593e = 1;
                if (e4Var.F(v0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.a1 a1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new y0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/t2;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/t2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class y1 extends vq.k implements er.q<id4.t2, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91595e;

        y1(tq.e<? super y1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91595e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.q2 q2Var = id4.i.q2.f91730a;
                this.f91595e = 1;
                if (e4Var.F(q2Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.t2 t2Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new y1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/y0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/y0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class y2 extends vq.k implements er.q<id4.y0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91597e;

        y2(tq.e<? super y2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91597e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.t0 t0Var = id4.i.t0.f91741a;
                this.f91597e = 1;
                if (e4Var.F(t0Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.y0 y0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new y2(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/d0;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/d0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class y3 extends vq.k implements er.q<id4.d0, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91599e;

        y3(tq.e<? super y3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91599e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.y yVar = id4.i.y.f91762a;
                this.f91599e = 1;
                if (e4Var.F(yVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.d0 d0Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new y3(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/y2;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/y2;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<OpenSchoolAttendance, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91602f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenSchoolAttendance openSchoolAttendance = (OpenSchoolAttendance) this.f91602f;
            Object objE = uq.b.e();
            int i15 = this.f91601e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToSchoolAttendance toSchoolAttendance = new id4.i.ToSchoolAttendance(openSchoolAttendance.getStudentId());
                this.f91602f = vq.j.a(openSchoolAttendance);
                this.f91601e = 1;
                if (e4Var.F(toSchoolAttendance, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenSchoolAttendance openSchoolAttendance, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            z zVar = e4.this.new z(eVar);
            zVar.f91602f = openSchoolAttendance;
            return zVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/a;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/a;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class z0 extends vq.k implements er.q<AddLocalNotification, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91605f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f91607e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e4 f91608f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ AddLocalNotification f91609g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4 e4Var, AddLocalNotification addLocalNotification, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f91608f = e4Var;
                this.f91609g = addLocalNotification;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f91607e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    s54.k kVar = this.f91608f.setLocalNotificationUseCase;
                    s54.k.Params params = new s54.k.Params(this.f91609g.getDocumentType());
                    this.f91607e = 1;
                    if (kVar.c(params, this) == objE) {
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

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f91608f, this.f91609g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        z0(tq.e<? super z0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            AddLocalNotification addLocalNotification = (AddLocalNotification) this.f91605f;
            uq.b.e();
            if (this.f91604e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e4 e4Var = e4.this;
            i00.a.a(e4Var, new a(e4Var, addLocalNotification, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(AddLocalNotification addLocalNotification, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            z0 z0Var = e4.this.new z0(eVar);
            z0Var.f91605f = addLocalNotification;
            return z0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/u1;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/u1;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class z1 extends vq.k implements er.q<id4.u1, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91610e;

        z1(tq.e<? super z1> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91610e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.r1 r1Var = id4.i.r1.f91734a;
                this.f91610e = 1;
                if (e4Var.F(r1Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.u1 u1Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new z1(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid4/v0;", "action", "Lid4/a4;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid4/v0;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class z2 extends vq.k implements er.q<OpenEIdServiceGlobalEvent, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91613f;

        z2(tq.e<? super z2> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenEIdServiceGlobalEvent openEIdServiceGlobalEvent = (OpenEIdServiceGlobalEvent) this.f91613f;
            Object objE = uq.b.e();
            int i15 = this.f91612e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.ToEIdServiceGlobalEvent toEIdServiceGlobalEvent = new id4.i.ToEIdServiceGlobalEvent(openEIdServiceGlobalEvent.getEvent());
                this.f91613f = vq.j.a(openEIdServiceGlobalEvent);
                this.f91612e = 1;
                if (e4Var.F(toEIdServiceGlobalEvent, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenEIdServiceGlobalEvent openEIdServiceGlobalEvent, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            z2 z2Var = e4.this.new z2(eVar);
            z2Var.f91613f = openEIdServiceGlobalEvent;
            return z2Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid4/r3;", "<unused var>", "Lid4/a4;", "Loq/i0;", "<anonymous>", "(Lid4/r3;Lid4/a4;)V"}, k = 3, mv = {2, 2, 0})
    static final class z3 extends vq.k implements er.q<id4.r3, id4.a4, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91615e;

        z3(tq.e<? super z3> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f91615e;
            if (i15 == 0) {
                oq.u.b(obj);
                e4 e4Var = e4.this;
                id4.i.o3 o3Var = id4.i.o3.f91721a;
                this.f91615e = 1;
                if (e4Var.F(o3Var, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id4.r3 r3Var, id4.a4 a4Var, tq.e<? super oq.i0> eVar) {
            return e4.this.new z3(eVar).J(oq.i0.f148189a);
        }
    }

    public e4(yy.a aVar, i70.e eVar, gx.d dVar, sw.a aVar2, s54.k kVar, lt0.d dVar2, ab4.a aVar3, q34.v vVar, w24.k kVar2, oz.t tVar, a14.q qVar, v64.q qVar2, xw.d dVar3, mz.l lVar, v64.o oVar, c54.b bVar) {
        this.globalSnackBarManager = eVar;
        this.globalEventManager = dVar;
        this.developerSettingsManager = aVar2;
        this.setLocalNotificationUseCase = kVar;
        this.markNotificationAsDisplayedUseCase = dVar2;
        this.getApplicationLockStateUseCase = aVar3;
        this.deleteDocumentByIdentityTypeUseCase = vVar;
        this.deleteDocumentByCertificateTypeUC = kVar2;
        this.restartApplicationManager = tVar;
        this.goToStoreIntentUseCase = qVar;
        this.logoutUC = qVar2;
        this.dispatcherProvider = dVar3;
        this.intentManager = lVar;
        this.isUserLoggedInUseCase = oVar;
        this.isFeatureEnabledUseCase = bVar;
        this.stateMachine = aVar.a(id4.a4.f91237a, new er.l() { // from class: id4.c4
            @Override // er.l
            public final Object b(Object obj) {
                return e4.B9(this.f91250a, (k10.v) obj);
            }
        });
        dVar.b(this);
        this.state = a9(new b(e9().getState()), b4.f91243a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(final e4 e4Var, k10.v vVar) {
        vVar.c(fr.q0.c(id4.a4.class), new er.l() { // from class: id4.d4
            @Override // er.l
            public final Object b(Object obj) {
                return e4.C9(this.f91259a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(e4 e4Var, k10.z zVar) {
        q0 q0Var = e4Var.new q0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(id4.c.class), oVar, q0Var);
        zVar.x(fr.q0.c(id4.e.class), oVar, e4Var.new b1(null));
        zVar.x(fr.q0.c(id4.t1.class), oVar, e4Var.new m1(null));
        zVar.x(fr.q0.c(OpenOnboarding.class), oVar, e4Var.new x1(null));
        zVar.x(fr.q0.c(id4.v1.class), oVar, e4Var.new i2(null));
        zVar.x(fr.q0.c(ShowSnackbarEvent.class), oVar, e4Var.new t2(null));
        zVar.x(fr.q0.c(MalwareDetected.class), oVar, e4Var.new e3(null));
        zVar.x(fr.q0.c(id4.w3.class), oVar, e4Var.new p3(null));
        zVar.x(fr.q0.c(id4.x3.class), oVar, e4Var.new a4(null));
        zVar.x(fr.q0.c(OpenSettings.class), oVar, e4Var.new c(null));
        zVar.x(fr.q0.c(id4.v3.class), oVar, e4Var.new x(null));
        zVar.x(fr.q0.c(Login.class), oVar, e4Var.new i0(null));
        zVar.x(fr.q0.c(id4.j.class), oVar, e4Var.new j0(null));
        zVar.x(fr.q0.c(id4.o0.class), oVar, e4Var.new k0(null));
        zVar.x(fr.q0.c(id4.e1.class), oVar, e4Var.new l0(null));
        zVar.x(fr.q0.c(OpenPayments.class), oVar, e4Var.new m0(null));
        zVar.x(fr.q0.c(id4.p0.class), oVar, e4Var.new n0(null));
        zVar.x(fr.q0.c(OpenDrivingLicence.class), oVar, e4Var.new o0(null));
        zVar.x(fr.q0.c(OpenAddDocument.class), oVar, e4Var.new p0(null));
        zVar.x(fr.q0.c(OpenDynamicDocument.class), oVar, e4Var.new r0(null));
        zVar.x(fr.q0.c(OpenDynamicMultiDocument.class), oVar, e4Var.new s0(null));
        zVar.x(fr.q0.c(OpenAddJuniorSchoolCard.class), oVar, e4Var.new t0(null));
        zVar.x(fr.q0.c(StudentCardActivated.class), oVar, e4Var.new u0(null));
        zVar.x(fr.q0.c(id4.n.class), oVar, e4Var.new v0(null));
        zVar.x(fr.q0.c(OpenExtendStudentCardValidity.class), oVar, e4Var.new w0(null));
        zVar.x(fr.q0.c(id4.k2.class), oVar, e4Var.new x0(null));
        zVar.x(fr.q0.c(id4.a1.class), oVar, e4Var.new y0(null));
        zVar.x(fr.q0.c(AddLocalNotification.class), oVar, e4Var.new z0(null));
        zVar.x(fr.q0.c(OpenDefaultNotificationDetails.class), oVar, e4Var.new a1(null));
        zVar.x(fr.q0.c(OpenInstantPaymentsDetails.class), oVar, e4Var.new c1(null));
        zVar.x(fr.q0.c(OpenConfirmation.class), oVar, e4Var.new d1(null));
        zVar.x(fr.q0.c(OpenVehicleCard.class), oVar, e4Var.new e1(null));
        zVar.x(fr.q0.c(id4.g3.class), oVar, e4Var.new f1(null));
        zVar.x(fr.q0.c(id4.o.class), oVar, e4Var.new g1(null));
        zVar.x(fr.q0.c(id4.k3.class), oVar, e4Var.new h1(null));
        zVar.x(fr.q0.c(id4.n0.class), oVar, e4Var.new i1(null));
        zVar.x(fr.q0.c(id4.q2.class), oVar, e4Var.new j1(null));
        zVar.x(fr.q0.c(id4.u2.class), oVar, e4Var.new k1(null));
        zVar.x(fr.q0.c(OpenVehicleHistory.class), oVar, e4Var.new l1(null));
        zVar.x(fr.q0.c(OpenNotification.class), oVar, e4Var.new n1(null));
        zVar.x(fr.q0.c(id4.z.class), oVar, e4Var.new o1(null));
        zVar.x(fr.q0.c(OpenWruDocument.class), oVar, e4Var.new p1(null));
        zVar.x(fr.q0.c(id4.i1.class), oVar, e4Var.new q1(null));
        zVar.x(fr.q0.c(id4.w.class), oVar, e4Var.new r1(null));
        zVar.x(fr.q0.c(OpenMakeProposalService.class), oVar, e4Var.new s1(null));
        zVar.x(fr.q0.c(id4.i0.class), oVar, e4Var.new t1(null));
        zVar.x(fr.q0.c(id4.j2.class), oVar, e4Var.new u1(null));
        zVar.x(fr.q0.c(OpenVerificationGlobalEvent.class), oVar, e4Var.new v1(null));
        zVar.x(fr.q0.c(id4.f1.class), oVar, e4Var.new w1(null));
        zVar.x(fr.q0.c(id4.t2.class), oVar, e4Var.new y1(null));
        zVar.x(fr.q0.c(id4.u1.class), oVar, e4Var.new z1(null));
        zVar.x(fr.q0.c(id4.l2.class), oVar, e4Var.new a2(null));
        zVar.x(fr.q0.c(id4.s.class), oVar, e4Var.new b2(null));
        zVar.x(fr.q0.c(id4.r.class), oVar, e4Var.new c2(null));
        zVar.x(fr.q0.c(id4.p3.class), oVar, e4Var.new d2(null));
        zVar.x(fr.q0.c(id4.q.class), oVar, e4Var.new e2(null));
        zVar.x(fr.q0.c(OpenUserData.class), oVar, e4Var.new f2(null));
        zVar.x(fr.q0.c(OpenApplicationLockGlobalEvent.class), oVar, e4Var.new g2(null));
        zVar.x(fr.q0.c(id4.w0.class), oVar, e4Var.new h2(null));
        zVar.x(fr.q0.c(id4.x0.class), oVar, e4Var.new j2(null));
        zVar.x(fr.q0.c(id4.t3.class), oVar, e4Var.new k2(null));
        zVar.x(fr.q0.c(id4.p.class), oVar, e4Var.new l2(null));
        zVar.x(fr.q0.c(id4.b1.class), oVar, e4Var.new m2(null));
        zVar.x(fr.q0.c(id4.s1.class), oVar, e4Var.new n2(null));
        zVar.x(fr.q0.c(id4.k.class), oVar, e4Var.new o2(null));
        zVar.x(fr.q0.c(OpenHistory.class), oVar, e4Var.new p2(null));
        zVar.x(fr.q0.c(id4.y.class), oVar, e4Var.new q2(null));
        zVar.x(fr.q0.c(id4.m2.class), oVar, e4Var.new r2(null));
        zVar.x(fr.q0.c(id4.x1.class), oVar, e4Var.new s2(null));
        zVar.x(fr.q0.c(id4.c2.class), oVar, e4Var.new u2(null));
        zVar.x(fr.q0.c(id4.x.class), oVar, e4Var.new v2(null));
        zVar.x(fr.q0.c(OpenDashboard.class), oVar, e4Var.new w2(null));
        zVar.x(fr.q0.c(OpenDashboardWithNotificationNavigation.class), oVar, e4Var.new x2(null));
        zVar.x(fr.q0.c(id4.y0.class), oVar, e4Var.new y2(null));
        zVar.x(fr.q0.c(OpenEIdServiceGlobalEvent.class), oVar, e4Var.new z2(null));
        zVar.x(fr.q0.c(id4.g0.class), oVar, e4Var.new a3(null));
        zVar.x(fr.q0.c(id4.f0.class), oVar, e4Var.new b3(null));
        zVar.x(fr.q0.c(id4.o2.class), oVar, e4Var.new c3(null));
        zVar.x(fr.q0.c(id4.n2.class), oVar, e4Var.new d3(null));
        zVar.x(fr.q0.c(id4.p2.class), oVar, e4Var.new f3(null));
        zVar.x(fr.q0.c(id4.a2.class), oVar, e4Var.new g3(null));
        zVar.x(fr.q0.c(id4.y1.class), oVar, e4Var.new h3(null));
        zVar.x(fr.q0.c(id4.u.class), oVar, e4Var.new i3(null));
        zVar.x(fr.q0.c(OpenGenericApplicationForms.class), oVar, e4Var.new j3(null));
        zVar.x(fr.q0.c(OpenPassportInvalidation.class), oVar, e4Var.new k3(null));
        zVar.x(fr.q0.c(id4.b0.class), oVar, e4Var.new l3(null));
        zVar.x(fr.q0.c(id4.u3.class), oVar, e4Var.new m3(null));
        zVar.x(fr.q0.c(GoToStore.class), oVar, e4Var.new n3(null));
        zVar.x(fr.q0.c(id4.g.class), oVar, e4Var.new o3(null));
        zVar.x(fr.q0.c(id4.c1.class), oVar, e4Var.new q3(null));
        zVar.x(fr.q0.c(id4.m1.class), oVar, e4Var.new r3(null));
        zVar.x(fr.q0.c(id4.j1.class), oVar, e4Var.new s3(null));
        zVar.x(fr.q0.c(id4.l1.class), oVar, e4Var.new t3(null));
        zVar.x(fr.q0.c(DeleteCert.class), oVar, e4Var.new u3(null));
        zVar.x(fr.q0.c(id4.r0.class), oVar, e4Var.new v3(null));
        zVar.x(fr.q0.c(id4.q0.class), oVar, e4Var.new w3(null));
        zVar.x(fr.q0.c(id4.k1.class), oVar, e4Var.new x3(null));
        zVar.x(fr.q0.c(id4.d0.class), oVar, e4Var.new y3(null));
        zVar.x(fr.q0.c(id4.r3.class), oVar, e4Var.new z3(null));
        zVar.x(fr.q0.c(id4.s2.class), oVar, e4Var.new d(null));
        zVar.x(fr.q0.c(id4.t.class), oVar, e4Var.new e(null));
        zVar.x(fr.q0.c(id4.e2.class), oVar, e4Var.new f(null));
        zVar.x(fr.q0.c(id4.f2.class), oVar, e4Var.new g(null));
        zVar.x(fr.q0.c(id4.e0.class), oVar, e4Var.new h(null));
        zVar.x(fr.q0.c(id4.r2.class), oVar, e4Var.new i(null));
        zVar.x(fr.q0.c(OpenIdentityConfirmation.class), oVar, e4Var.new j(null));
        zVar.x(fr.q0.c(id4.m0.class), oVar, e4Var.new k(null));
        zVar.x(fr.q0.c(id4.r1.class), oVar, e4Var.new l(null));
        zVar.x(fr.q0.c(id4.a0.class), oVar, e4Var.new m(null));
        zVar.x(fr.q0.c(id4.c0.class), oVar, e4Var.new n(null));
        zVar.x(fr.q0.c(id4.q3.class), oVar, e4Var.new o(null));
        zVar.x(fr.q0.c(id4.g1.class), oVar, e4Var.new p(null));
        zVar.x(fr.q0.c(id4.z1.class), oVar, e4Var.new q(null));
        zVar.x(fr.q0.c(id4.o1.class), oVar, e4Var.new r(null));
        zVar.x(fr.q0.c(id4.v2.class), oVar, e4Var.new s(null));
        zVar.x(fr.q0.c(id4.h2.class), oVar, e4Var.new t(null));
        zVar.x(fr.q0.c(id4.q1.class), oVar, e4Var.new u(null));
        zVar.x(fr.q0.c(id4.h3.class), oVar, e4Var.new v(null));
        zVar.x(fr.q0.c(id4.a3.class), oVar, e4Var.new w(null));
        zVar.x(fr.q0.c(OpenSchoolGrades.class), oVar, e4Var.new y(null));
        zVar.x(fr.q0.c(OpenSchoolAttendance.class), oVar, e4Var.new z(null));
        zVar.x(fr.q0.c(OpenSchoolTimetable.class), oVar, e4Var.new a0(null));
        zVar.x(fr.q0.c(OpenSchoolBehavior.class), oVar, e4Var.new b0(null));
        zVar.x(fr.q0.c(OpenSchoolGradesDetails.class), oVar, e4Var.new c0(null));
        zVar.x(fr.q0.c(OpenSchoolLessonDetails.class), oVar, e4Var.new d0(null));
        zVar.x(fr.q0.c(OpenSchoolAbsenceStatusDetails.class), oVar, e4Var.new e0(null));
        zVar.x(fr.q0.c(id4.w2.class), oVar, e4Var.new f0(null));
        zVar.x(fr.q0.c(OpenTravelAbroadCountryDetails.class), oVar, e4Var.new g0(null));
        zVar.x(fr.q0.c(id4.n3.class), oVar, e4Var.new h0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y9(String notificationMessageId) {
        i00.a.a(this, new a(notificationMessageId, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<id4.i> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.globalEventManager.a(this);
    }

    @Override // l00.g
    protected k10.t<id4.a4, Object> e9() {
        return this.stateMachine;
    }

    @Override // gx.c
    public boolean j5(gx.b event) {
        if (event instanceof y70.e4.a) {
            d9(id4.v1.f91843a);
            return true;
        }
        if (event instanceof ShowSnackbarEvent) {
            d9(new ShowSnackbarEvent(((ShowSnackbarEvent) event).getSnackbarLabel()));
            return true;
        }
        if (event instanceof e93.b.MalwareDetected) {
            e93.b.MalwareDetected malwareDetected = (e93.b.MalwareDetected) event;
            d9(new MalwareDetected(malwareDetected.getDangerousToolsName(), malwareDetected.getDangerousToolsPackage()));
            return true;
        }
        if (event instanceof e93.b.SecurityThreatsDetected) {
            d9(id4.w3.f91850a);
            return true;
        }
        if (event instanceof e93.b.c) {
            d9(id4.x3.f91857a);
            return true;
        }
        if (event instanceof tg1.a.f) {
            d9(id4.c.f91244a);
            return true;
        }
        if (event instanceof e53.a.ToSettings) {
            d9(new OpenSettings(((e53.a.ToSettings) event).getDestination()));
            return true;
        }
        if (fr.t.c(event, e53.a.C1094a.f47618a)) {
            d9(id4.v3.f91845a);
            return true;
        }
        if (event instanceof tj2.b.ToLogin) {
            d9(new Login(((tj2.b.ToLogin) event).getRedirection()));
            return true;
        }
        if (event instanceof t64.b.a) {
            d9(id4.j.f91777a);
            return true;
        }
        if (event instanceof jo1.a.C2477a) {
            d9(id4.o0.f91807a);
            return true;
        }
        if (event instanceof w72.a.C5539a) {
            d9(id4.e1.f91262a);
            return true;
        }
        if (event instanceof w32.b.ToPayments) {
            d9(new OpenPayments((w32.b.ToPayments) event));
            return true;
        }
        if (event instanceof po2.a.ToOnboarding) {
            po2.a.ToOnboarding toOnboarding = (po2.a.ToOnboarding) event;
            d9(new OpenOnboarding(toOnboarding.getClearProcesses(), toOnboarding.getResetPassword(), toOnboarding.getShowAppNotActivatedDialog()));
            return true;
        }
        if (event instanceof ts1.a.C5011a) {
            d9(id4.p0.f91812a);
            return true;
        }
        if ((event instanceof ju1.a.C2508a) || fr.t.c(event, ju1.a.b.f105877a)) {
            d9(new OpenDrivingLicence(event));
            return true;
        }
        if (event instanceof zw0.a.ToAddDocument) {
            d9(new OpenAddDocument((zw0.a.ToAddDocument) event));
            return true;
        }
        if (event instanceof fv1.a.ToDynamicDocument) {
            d9(new OpenDynamicDocument(((fv1.a.ToDynamicDocument) event).getDynamicDocumentType()));
            return true;
        }
        if (event instanceof fv1.a.ToDynamicMultiDocument) {
            d9(new OpenDynamicMultiDocument(((fv1.a.ToDynamicMultiDocument) event).getDynamicMultiDocumentType()));
            return true;
        }
        if (event instanceof ToAddJuniorSchoolCard) {
            d9(new OpenAddJuniorSchoolCard(((ToAddJuniorSchoolCard) event).getFromDynamicDocumentsList()));
            return true;
        }
        if (event instanceof StudentCardActivated) {
            d9(new StudentCardActivated(((StudentCardActivated) event).getClearProcess()));
            return true;
        }
        if (event instanceof o73.c) {
            d9(id4.n.f91801a);
            return true;
        }
        if (event instanceof ToExtendStudentCardValidity) {
            d9(new OpenExtendStudentCardValidity(((ToExtendStudentCardValidity) event).getClearProcess()));
            return true;
        }
        if (event instanceof ls2.a.C2929a) {
            d9(id4.k2.f91786a);
            return true;
        }
        if (event instanceof h62.a.C1873a) {
            d9(id4.a1.f91234a);
            return true;
        }
        if (event instanceof fo2.a.AddLocalNotification) {
            d9(new AddLocalNotification(((fo2.a.AddLocalNotification) event).getDocumentType()));
            return true;
        }
        if (event instanceof r74.b.ToDefaultNotificationDetails) {
            d9(new OpenDefaultNotificationDetails(((r74.b.ToDefaultNotificationDetails) event).getData()));
            return true;
        }
        if (event instanceof v32.b.ToInstantPaymentsDetails) {
            d9(new OpenInstantPaymentsDetails((v32.b.ToInstantPaymentsDetails) event));
            return true;
        }
        if (event instanceof eo2.b.ToConfirmation) {
            d9(new OpenConfirmation(((eo2.b.ToConfirmation) event).getData()));
            return true;
        }
        if (event instanceof wm3.c.ToVehicleCard) {
            d9(new OpenVehicleCard(((wm3.c.ToVehicleCard) event).getDestination()));
            return true;
        }
        if (event instanceof i73.a.C2133a) {
            d9(id4.g3.f91627a);
            return true;
        }
        if (event instanceof tx0.a.C5035a) {
            d9(id4.o.f91806a);
            return true;
        }
        if (event instanceof fd3.a.C1395a) {
            d9(id4.k3.f91787a);
            return true;
        }
        if (event instanceof bo1.a.C0537a) {
            d9(id4.n0.f91802a);
            return true;
        }
        if (event instanceof oi2.a.C3628a) {
            d9(id4.e.f91260a);
            return true;
        }
        if (event instanceof r43.a.e) {
            d9(id4.q2.f91819a);
            return true;
        }
        if (fr.t.c(event, l03.a.C2766a.f113996a)) {
            d9(id4.u2.f91839a);
            return true;
        }
        if (event instanceof zi3.a.ToVehicleHistory) {
            zi3.a.ToVehicleHistory toVehicleHistory = (zi3.a.ToVehicleHistory) event;
            d9(new OpenVehicleHistory(toVehicleHistory.getVin(), toVehicleHistory.getPlate(), toVehicleHistory.getSkipForm(), toVehicleHistory.getFirstRegistrationDate()));
            return true;
        }
        if (event instanceof go2.a.ToNotification) {
            d9(new OpenNotification(((go2.a.ToNotification) event).getDestination()));
            return true;
        }
        if (event instanceof b21.a.C0381a) {
            d9(id4.z.f91863a);
            return true;
        }
        if (event instanceof zq3.a.ToWruDocument) {
            d9(new OpenWruDocument(((zq3.a.ToWruDocument) event).getLicenceCode()));
            return true;
        }
        if (event instanceof r43.a.c) {
            d9(id4.i1.f91772a);
            return true;
        }
        if (event instanceof r43.a.C4368a) {
            d9(id4.w.f91846a);
            return true;
        }
        if (event instanceof r43.a.ToMakeProposalService) {
            d9(new OpenMakeProposalService(((r43.a.ToMakeProposalService) event).getSupplementOrigin()));
            return true;
        }
        if (event instanceof r43.a.b) {
            d9(id4.i0.f91771a);
            return true;
        }
        if (event instanceof as2.a.C0311a) {
            d9(id4.j2.f91780a);
            return true;
        }
        if (event instanceof wn3.x) {
            d9(new OpenVerificationGlobalEvent((wn3.x) event));
            return true;
        }
        if (event instanceof m83.a.b) {
            d9(id4.f1.f91619a);
            return true;
        }
        if (event instanceof m83.a.C3059a) {
            d9(id4.t2.f91834a);
            return true;
        }
        if (event instanceof jk2.a.C2462a) {
            d9(id4.u1.f91838a);
            return true;
        }
        if (event instanceof ss2.a.C4742a) {
            d9(id4.l2.f91791a);
            return true;
        }
        if (event instanceof e01.a.b) {
            d9(id4.s.f91826a);
            return true;
        }
        if (event instanceof e01.a.C1053a) {
            d9(id4.r.f91821a);
            return true;
        }
        if (event instanceof hp3.a.C2012a) {
            d9(id4.p3.f91815a);
            return true;
        }
        if (event instanceof oq3.a) {
            d9(id4.q.f91816a);
            return true;
        }
        if (event instanceof nc3.a.ToUserData) {
            d9(new OpenUserData(((nc3.a.ToUserData) event).getForceFetchNewPassports()));
            return true;
        }
        if (event instanceof l74.a) {
            d9(new OpenApplicationLockGlobalEvent((l74.a) event));
            return true;
        }
        if (fr.t.c(event, ry1.a.C4516a.f176876a)) {
            d9(id4.w0.f91847a);
            return true;
        }
        if (fr.t.c(event, gz1.a.C1794a.f78547a)) {
            d9(id4.x0.f91852a);
            return true;
        }
        if (fr.t.c(event, jr3.a.C2485a.f104604a)) {
            d9(id4.t3.f91835a);
            return true;
        }
        if (event instanceof ay0.a.C0352a) {
            d9(id4.p.f91811a);
            return true;
        }
        if (fr.t.c(event, p62.a.C3769a.f153207a)) {
            d9(id4.b1.f91240a);
            return true;
        }
        if (fr.t.c(event, nj2.a.C3373a.f136850a)) {
            d9(id4.s1.f91828a);
            return true;
        }
        if (fr.t.c(event, sw0.b.a.f184874a)) {
            d9(id4.t1.f91833a);
            return true;
        }
        if (fr.t.c(event, sw0.a.C4774a.f184873a)) {
            d9(id4.k.f91782a);
            return true;
        }
        if (event instanceof y92.b.ToHistory) {
            d9(new OpenHistory(((y92.b.ToHistory) event).getExcludeItems()));
            return true;
        }
        if (event instanceof n11.a.C3242a) {
            d9(id4.y.f91858a);
            return true;
        }
        if (event instanceof vt2.a.C5468a) {
            d9(id4.m2.f91796a);
            return true;
        }
        if (event instanceof qy2.h.a) {
            d9(id4.x1.f91853a);
            return true;
        }
        if (event instanceof qy2.h.b) {
            d9(id4.c2.f91247a);
            return true;
        }
        if (event instanceof e11.a.C1060a) {
            d9(id4.x.f91851a);
            return true;
        }
        if (event instanceof tg1.a.ToDashboard) {
            d9(new OpenDashboard(((tg1.a.ToDashboard) event).getClearProcesses()));
            return true;
        }
        if (event instanceof tg1.a.ToDashboardWithNotificationNavigation) {
            tg1.a.ToDashboardWithNotificationNavigation toDashboardWithNotificationNavigation = (tg1.a.ToDashboardWithNotificationNavigation) event;
            d9(new OpenDashboardWithNotificationNavigation(toDashboardWithNotificationNavigation.getClearProcesses(), toDashboardWithNotificationNavigation.getLocalNotificationItem()));
            return true;
        }
        if (event instanceof f02.b.a) {
            d9(id4.y0.f91859a);
            return true;
        }
        if (event instanceof hx1.a) {
            d9(new OpenEIdServiceGlobalEvent((hx1.a) event));
            return true;
        }
        if (event instanceof ia1.b.a) {
            d9(id4.g0.f91623a);
            return true;
        }
        if (event instanceof nd3.a) {
            d9(id4.f0.f91618a);
            return true;
        }
        if (event instanceof hv2.b) {
            d9(id4.o2.f91809a);
            return true;
        }
        if (event instanceof hv2.a) {
            d9(id4.n2.f91804a);
            return true;
        }
        if (event instanceof hv2.c) {
            d9(id4.p2.f91814a);
            return true;
        }
        if (event instanceof yl2.a.C6114a) {
            d9(id4.a2.f91235a);
            return true;
        }
        if (event instanceof zk2.a.C6358a) {
            d9(id4.y1.f91860a);
            return true;
        }
        if (event instanceof tz0.c) {
            d9(id4.u.f91836a);
            return true;
        }
        if (event instanceof ToGenericApplicationForms) {
            d9(new OpenGenericApplicationForms(((ToGenericApplicationForms) event).getData()));
            return true;
        }
        if (event instanceof ToPassportInvalidation) {
            d9(new OpenPassportInvalidation(((ToPassportInvalidation) event).getPassportNumber()));
            return true;
        }
        if (event instanceof k31.a) {
            d9(id4.b0.f91239a);
            return true;
        }
        if (event instanceof gx.a.c) {
            d9(id4.u3.f91840a);
            return true;
        }
        if (event instanceof gx.a.GoToStore) {
            d9(new GoToStore(((gx.a.GoToStore) event).getPackageName()));
            return true;
        }
        if (event instanceof gx.a.b) {
            d9(id4.g.f91622a);
            return true;
        }
        if (event instanceof b72.b.a) {
            d9(id4.c1.f91246a);
            return true;
        }
        if (event instanceof vc2.a) {
            d9(id4.m1.f91795a);
            return true;
        }
        if (event instanceof ab2.a) {
            d9(id4.j1.f91779a);
            return true;
        }
        if (event instanceof ib2.b) {
            d9(id4.l1.f91790a);
            return true;
        }
        if (event instanceof DeleteCert) {
            d9(new DeleteCert(((DeleteCert) event).getIdentityType()));
            return true;
        }
        if (event instanceof wt1.a) {
            d9(id4.r0.f91822a);
            return true;
        }
        if (event instanceof ft1.a.C1501a) {
            d9(id4.q0.f91817a);
            return true;
        }
        if (event instanceof nd2.a) {
            d9(id4.k1.f91785a);
            return true;
        }
        if (event instanceof fm1.a) {
            d9(id4.d0.f91252a);
            return true;
        }
        if (event instanceof fm1.b) {
            d9(id4.r3.f91825a);
            return true;
        }
        if (fr.t.c(event, xz2.a.C5949a.f222433a)) {
            d9(id4.s2.f91829a);
            return true;
        }
        if (fr.t.c(event, kz0.a.C2755a.f113473a)) {
            d9(id4.t.f91831a);
            return true;
        }
        if (fr.t.c(event, cp2.a.f37245a)) {
            d9(id4.e2.f91263a);
            return true;
        }
        if (fr.t.c(event, pq2.a.f161745a)) {
            d9(id4.f2.f91620a);
            return true;
        }
        if (fr.t.c(event, x51.a.f216911a)) {
            d9(id4.e0.f91261a);
            return true;
        }
        if (fr.t.c(event, wy2.c.b.f215979a)) {
            d9(id4.r2.f91824a);
            return true;
        }
        if (event instanceof wy2.c.ToIdentityConfirmation) {
            d9(new OpenIdentityConfirmation(((wy2.c.ToIdentityConfirmation) event).getEntryPoint()));
            return true;
        }
        if (event instanceof si1.b.a) {
            d9(id4.m0.f91794a);
            return true;
        }
        if (event instanceof yf2.a.C6082a) {
            d9(id4.r1.f91823a);
            return true;
        }
        if (event instanceof u21.a) {
            d9(id4.a0.f91233a);
            return true;
        }
        if (event instanceof hk1.b) {
            d9(id4.c0.f91245a);
            return true;
        }
        if (event instanceof hk1.c) {
            d9(id4.q3.f91820a);
            return true;
        }
        if (fr.t.c(event, t92.a.C4907a.f189003a)) {
            d9(id4.g1.f91624a);
            return true;
        }
        if (fr.t.c(event, il2.a.C2200a.f93279a)) {
            d9(id4.z1.f91865a);
            return true;
        }
        if (fr.t.c(event, vd2.a.f206264a)) {
            d9(id4.o1.f91808a);
            return true;
        }
        if (event instanceof h13.b.a) {
            d9(id4.v2.f91844a);
            return true;
        }
        if (event instanceof pr2.b) {
            d9(id4.h2.f91633a);
            return true;
        }
        if (event instanceof defpackage.a.C0004a) {
            d9(id4.q1.f91818a);
            return true;
        }
        if (event instanceof s93.b) {
            d9(id4.h3.f91634a);
            return true;
        }
        if (event instanceof ToCountryDetails) {
            ToCountryDetails toCountryDetails = (ToCountryDetails) event;
            d9(new OpenTravelAbroadCountryDetails(toCountryDetails.getMessageId(), toCountryDetails.getMessageDisplayed(), toCountryDetails.getCountryIso()));
            return true;
        }
        if (event instanceof d43.a) {
            d9(id4.a3.f91236a);
            return true;
        }
        if (event instanceof ToSchoolGrades) {
            d9(new OpenSchoolGrades(((ToSchoolGrades) event).getStudentId()));
            return true;
        }
        if (event instanceof ToSchoolAttendance) {
            d9(new OpenSchoolAttendance(((ToSchoolAttendance) event).getStudentId()));
            return true;
        }
        if (event instanceof ToAbsenceStatusDetails) {
            ToAbsenceStatusDetails toAbsenceStatusDetails = (ToAbsenceStatusDetails) event;
            d9(new OpenSchoolAbsenceStatusDetails(toAbsenceStatusDetails.getStudentId(), toAbsenceStatusDetails.getSemesterId(), toAbsenceStatusDetails.getAttendanceType()));
            return true;
        }
        if (event instanceof ToSchoolTimetable) {
            d9(new OpenSchoolTimetable(((ToSchoolTimetable) event).getStudentId()));
            return true;
        }
        if (event instanceof ToSchoolBehavior) {
            d9(new OpenSchoolBehavior(((ToSchoolBehavior) event).getStudentId()));
            return true;
        }
        if (event instanceof ToGradeDetails) {
            ToGradeDetails toGradeDetails = (ToGradeDetails) event;
            d9(new OpenSchoolGradesDetails(toGradeDetails.getStudentId(), toGradeDetails.getGradeId()));
            return true;
        }
        if (event instanceof ToSchoolLessonDetails) {
            ToSchoolLessonDetails toSchoolLessonDetails = (ToSchoolLessonDetails) event;
            d9(new OpenSchoolLessonDetails(toSchoolLessonDetails.getStudentId(), toSchoolLessonDetails.getLessonId()));
            return true;
        }
        if (event instanceof i23.a.C2089a) {
            d9(id4.w2.f91849a);
            return true;
        }
        if (!(event instanceof gk3.a)) {
            return false;
        }
        d9(id4.n3.f91805a);
        return true;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(id4.i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    public void z9(Intent intent) {
        this.intentManager.b(intent);
    }
}
