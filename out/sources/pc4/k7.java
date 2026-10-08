package pc4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rn0.BEAttendance;
import rn0.BEAttendanceStatusDetails;
import rn0.BEAttendanceStatusSummary;
import rn0.BEAttendanceSummary;
import rn0.BEAttendancesDay;
import rn0.BEPresenceSummary;
import rn0.BESchoolFamilyMessage;
import rn0.BESemesterAttendanceSummary;
import rn0.BESubjectPresenceSummary;
import s84.AttendanceDay;
import s84.AttendanceEntry;
import s84.AttendanceStatusDetails;
import s84.AttendanceStatusSummary;
import s84.PresenceSummary;
import s84.SchoolAttendanceMessage;
import s84.SemesterAttendanceSummary;
import s84.SubjectPresenceSummary;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&J\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*J\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.J\u0011\u00101\u001a\u000200*\u00020/¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u00020\b*\u00020\t¢\u0006\u0004\b3\u00104J\u0011\u00107\u001a\u000206*\u000205¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lpc4/k7;", "", "<init>", "()V", "Lrn0/e;", "Ls84/f;", "g", "(Lrn0/e;)Ls84/f;", "Ls84/c;", "Lrn0/b;", "k", "(Ls84/c;)Lrn0/b;", "Lrn0/c;", "Ls84/d;", "i", "(Lrn0/c;)Ls84/d;", "Lrn0/f;", "Ls84/a;", "e", "(Lrn0/f;)Ls84/a;", "Lrn0/a;", "Ls84/b;", "f", "(Lrn0/a;)Ls84/b;", "Ltn0/c;", "getAttendanceSummaryByParentUC", "Ltn0/a;", "getAttendanceStatusDetailsByParentUC", "Lr84/a;", "d", "(Ltn0/c;Ltn0/a;)Lr84/a;", "Lrn0/b0;", "Ls84/k;", "n", "(Lrn0/b0;)Ls84/k;", "Lrn0/y;", "Ls84/i;", "l", "(Lrn0/y;)Ls84/i;", "Lrn0/d;", "Ls84/e;", "j", "(Lrn0/d;)Ls84/e;", "Lrn0/j0;", "Ls84/m;", "p", "(Lrn0/j0;)Ls84/m;", "Lrn0/a0;", "Ls84/j;", "m", "(Lrn0/a0;)Ls84/j;", "h", "(Lrn0/b;)Ls84/c;", "Lrn0/i0;", "Ls84/l;", "o", "(Lrn0/i0;)Ls84/l;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k7 f155083a = new k7();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155086c;

        static {
            int[] iArr = new int[rn0.b.values().length];
            try {
                iArr[rn0.b.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rn0.b.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rn0.b.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rn0.b.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rn0.b.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rn0.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f155084a = iArr;
            int[] iArr2 = new int[s84.c.values().length];
            try {
                iArr2[s84.c.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[s84.c.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[s84.c.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[s84.c.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[s84.c.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[s84.c.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f155085b = iArr2;
            int[] iArr3 = new int[rn0.i0.values().length];
            try {
                iArr3[rn0.i0.APPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[rn0.i0.ATOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[rn0.i0.BACTERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[rn0.i0.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[rn0.i0.BALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[rn0.i0.BELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[rn0.i0.BLOCKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[rn0.i0.BRIEFCASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[rn0.i0.BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[rn0.i0.CHART.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[rn0.i0.COLUMN.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[rn0.i0.COMPUTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[rn0.i0.FOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[rn0.i0.GLASSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[rn0.i0.GLOBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[rn0.i0.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[rn0.i0.HAND_GESTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[rn0.i0.HOURGLASS.ordinal()] = 18;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[rn0.i0.LANGUAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[rn0.i0.LEAF.ordinal()] = 20;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[rn0.i0.MAGNET.ordinal()] = 21;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[rn0.i0.MUSIC_NOTE.ordinal()] = 22;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[rn0.i0.NOTEBOOK.ordinal()] = 23;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[rn0.i0.PALETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[rn0.i0.PEN.ordinal()] = 25;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[rn0.i0.POOL.ordinal()] = 26;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[rn0.i0.PUZZLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[rn0.i0.RULER.ordinal()] = 28;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[rn0.i0.SCISSORS.ordinal()] = 29;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[rn0.i0.SECURITY.ordinal()] = 30;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[rn0.i0.SUPPORT.ordinal()] = 31;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[rn0.i0.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused44) {
            }
            f155086c = iArr3;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"pc4/k7$b", "Lr84/a;", "", "studentId", "Ldx/i;", "Ldx/b;", "Ls84/f;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Ls84/c;", "status", "Ls84/d;", "c", "(Ljava/lang/String;Ljava/lang/String;Ls84/c;Ltq/e;)Ljava/lang/Object;", "Lq84/a;", "Lq84/a;", "b", "()Lq84/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements r84.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q84.a featureConfig = q84.a.MOBYWATEL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tn0.c f155088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tn0.a f155089c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155090d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155091e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155092f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f155093g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155095j;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155093g = obj;
                this.f155095j |= PKIFailureInfo.systemUnavail;
                return b.this.c(null, null, null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.k7$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3845b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155096d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155097e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155099g;

            C3845b(tq.e<? super C3845b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155097e = obj;
                this.f155099g |= PKIFailureInfo.systemUnavail;
                return b.this.a(null, this);
            }
        }

        b(tn0.c cVar, tn0.a aVar) {
            this.f155088b = cVar;
            this.f155089c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r84.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends s84.f>> eVar) throws Throwable {
            C3845b c3845b;
            if (eVar instanceof C3845b) {
                c3845b = (C3845b) eVar;
                int i15 = c3845b.f155099g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3845b.f155099g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3845b = new C3845b(eVar);
                }
            } else {
                c3845b = new C3845b(eVar);
            }
            Object objA = c3845b.f155097e;
            Object objE = uq.b.e();
            int i16 = c3845b.f155099g;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.c cVar = this.f155088b;
                if (str == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                c3845b.f155096d = vq.j.a(str);
                c3845b.f155099g = 1;
                objA = cVar.a(str, c3845b);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(k7.f155083a.g((BEAttendanceSummary) ((dx.i.Right) iVar).b()));
        }

        @Override // r84.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public q84.a getFeatureConfig() {
            return this.featureConfig;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r84.a
        public Object c(String str, String str2, s84.c cVar, tq.e<? super dx.i<? extends dx.b, AttendanceStatusDetails>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f155095j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f155095j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objA = aVar.f155093g;
            Object objE = uq.b.e();
            int i16 = aVar.f155095j;
            if (i16 == 0) {
                oq.u.b(objA);
                tn0.a aVar2 = this.f155089c;
                if (str == null) {
                    throw new IllegalArgumentException("studentId is required for MOBYWATEL");
                }
                rn0.b bVarK = k7.f155083a.k(cVar);
                aVar.f155090d = vq.j.a(str);
                aVar.f155091e = vq.j.a(str2);
                aVar.f155092f = vq.j.a(cVar);
                aVar.f155095j = 1;
                objA = aVar2.a(str, bVarK, str2, aVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(k7.f155083a.i((BEAttendanceStatusDetails) ((dx.i.Right) iVar).b()));
        }
    }

    private k7() {
    }

    private final AttendanceDay e(BEAttendancesDay bEAttendancesDay) {
        List<BEAttendance> listA = bEAttendancesDay.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f155083a.f((BEAttendance) it.next()));
        }
        return new AttendanceDay(arrayList, bEAttendancesDay.getDate());
    }

    private final AttendanceEntry f(BEAttendance bEAttendance) {
        return new AttendanceEntry(bEAttendance.getFromTime(), bEAttendance.getTitle(), bEAttendance.getToTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s84.f g(BEAttendanceSummary bEAttendanceSummary) {
        List<BESemesterAttendanceSummary> listB = bEAttendanceSummary.b();
        BESchoolFamilyMessage message = bEAttendanceSummary.getMessage();
        if (message != null) {
            return new s84.f.EmptyState(m(message));
        }
        if (listB == null) {
            return s84.f.c.f179316a;
        }
        List<BESemesterAttendanceSummary> list = listB;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f155083a.n((BESemesterAttendanceSummary) it.next()));
        }
        return new s84.f.AttendanceSemesters(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AttendanceStatusDetails i(BEAttendanceStatusDetails bEAttendanceStatusDetails) {
        List<BEAttendancesDay> listA = bEAttendanceStatusDetails.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f155083a.e((BEAttendancesDay) it.next()));
        }
        return new AttendanceStatusDetails(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rn0.b k(s84.c cVar) {
        switch (a.f155085b[cVar.ordinal()]) {
            case 1:
                return rn0.b.ABSENCE;
            case 2:
                return rn0.b.SCHOOL_REASONS_ABSENCE;
            case 3:
                return rn0.b.LATENESS;
            case 4:
                return rn0.b.EXCUSE;
            case 5:
                return rn0.b.JUSTIFICATION;
            case 6:
                return rn0.b.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public final r84.a d(tn0.c getAttendanceSummaryByParentUC, tn0.a getAttendanceStatusDetailsByParentUC) {
        return new b(getAttendanceSummaryByParentUC, getAttendanceStatusDetailsByParentUC);
    }

    public final s84.c h(rn0.b bVar) {
        switch (a.f155084a[bVar.ordinal()]) {
            case 1:
                return s84.c.ABSENCE;
            case 2:
                return s84.c.SCHOOL_REASONS_ABSENCE;
            case 3:
                return s84.c.LATENESS;
            case 4:
                return s84.c.EXCUSE;
            case 5:
                return s84.c.JUSTIFICATION;
            case 6:
                return s84.c.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public final AttendanceStatusSummary j(BEAttendanceStatusSummary bEAttendanceStatusSummary) {
        return new AttendanceStatusSummary(bEAttendanceStatusSummary.getCount(), h(bEAttendanceStatusSummary.getStatus()), bEAttendanceStatusSummary.getTitle());
    }

    public final PresenceSummary l(BEPresenceSummary bEPresenceSummary) {
        int schoolYearAttendancePercentage = bEPresenceSummary.getSchoolYearAttendancePercentage();
        int semesterAttendancePercentage = bEPresenceSummary.getSemesterAttendancePercentage();
        List<BESubjectPresenceSummary> listC = bEPresenceSummary.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f155083a.p((BESubjectPresenceSummary) it.next()));
        }
        return new PresenceSummary(schoolYearAttendancePercentage, semesterAttendancePercentage, arrayList, bEPresenceSummary.getTitle());
    }

    public final SchoolAttendanceMessage m(BESchoolFamilyMessage bESchoolFamilyMessage) {
        return new SchoolAttendanceMessage(bESchoolFamilyMessage.getTitle(), bESchoolFamilyMessage.getMessage());
    }

    public final SemesterAttendanceSummary n(BESemesterAttendanceSummary bESemesterAttendanceSummary) {
        boolean current = bESemesterAttendanceSummary.getCurrent();
        PresenceSummary presenceSummaryL = l(bESemesterAttendanceSummary.getPresenceSummary());
        String semesterId = bESemesterAttendanceSummary.getSemesterId();
        List<BEAttendanceStatusSummary> listD = bESemesterAttendanceSummary.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(f155083a.j((BEAttendanceStatusSummary) it.next()));
        }
        return new SemesterAttendanceSummary(current, presenceSummaryL, semesterId, arrayList, bESemesterAttendanceSummary.getTitle());
    }

    public final s84.l o(rn0.i0 i0Var) {
        switch (a.f155086c[i0Var.ordinal()]) {
            case 1:
                return s84.l.APPLE;
            case 2:
                return s84.l.ATOM;
            case 3:
                return s84.l.BACTERIA;
            case 4:
                return s84.l.BALANCE;
            case 5:
                return s84.l.BALL;
            case 6:
                return s84.l.BELL;
            case 7:
                return s84.l.BLOCKS;
            case 8:
                return s84.l.BRIEFCASE;
            case 9:
                return s84.l.BUILDING;
            case 10:
                return s84.l.CHART;
            case 11:
                return s84.l.COLUMN;
            case 12:
                return s84.l.COMPUTER;
            case 13:
                return s84.l.FOLDER;
            case 14:
                return s84.l.GLASSES;
            case 15:
                return s84.l.GLOBE;
            case 16:
                return s84.l.GROUP;
            case 17:
                return s84.l.HAND_GESTURE;
            case 18:
                return s84.l.HOURGLASS;
            case 19:
                return s84.l.LANGUAGE;
            case 20:
                return s84.l.LEAF;
            case 21:
                return s84.l.MAGNET;
            case 22:
                return s84.l.MUSIC_NOTE;
            case 23:
                return s84.l.NOTEBOOK;
            case 24:
                return s84.l.PALETTE;
            case 25:
                return s84.l.PEN;
            case 26:
                return s84.l.POOL;
            case 27:
                return s84.l.PUZZLE;
            case 28:
                return s84.l.RULER;
            case 29:
                return s84.l.SCISSORS;
            case 30:
                return s84.l.SECURITY;
            case BERTags.DATE /* 31 */:
                return s84.l.SUPPORT;
            case 32:
                return s84.l.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public final SubjectPresenceSummary p(BESubjectPresenceSummary bESubjectPresenceSummary) {
        return new SubjectPresenceSummary(bESubjectPresenceSummary.getAttendancePercentage(), o(bESubjectPresenceSummary.getSubjectIcon()), bESubjectPresenceSummary.getSubjectName());
    }
}
