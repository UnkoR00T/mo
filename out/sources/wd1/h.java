package wd1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u0006B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lwd1/h;", "", "Lrd1/c;", "answer", "<init>", "(Lrd1/c;)V", "a", "Lrd1/c;", "getAnswer", "()Lrd1/c;", "b", "Lwd1/h$a;", "Lwd1/h$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rd1.c answer;

    /* JADX INFO: renamed from: wd1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd1/h$a;", "Lwd1/h;", "Lrd1/c;", "answer", "<init>", "(Lrd1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrd1/c;", "a", "()Lrd1/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoPage extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rd1.c answer;

        public InfoPage(rd1.c cVar) {
            super(cVar, null);
            this.answer = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public rd1.c getAnswer() {
            return this.answer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InfoPage) && this.answer == ((InfoPage) other).answer;
        }

        public int hashCode() {
            rd1.c cVar = this.answer;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "InfoPage(answer=" + this.answer + ')';
        }
    }

    /* JADX INFO: renamed from: wd1.h$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lwd1/h$b;", "Lwd1/h;", "Lrd1/c;", "answer", "Lld1/l;", "processType", "<init>", "(Lrd1/c;Lld1/l;)V", "a", "(Lrd1/c;Lld1/l;)Lwd1/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrd1/c;", "c", "()Lrd1/c;", "Lld1/l;", "d", "()Lld1/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rd1.c answer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ld1.l processType;

        public Initialized(rd1.c cVar, ld1.l lVar) {
            super(cVar, null);
            this.answer = cVar;
            this.processType = lVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, rd1.c cVar, ld1.l lVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = initialized.answer;
            }
            if ((i15 & 2) != 0) {
                lVar = initialized.processType;
            }
            return initialized.a(cVar, lVar);
        }

        public final Initialized a(rd1.c answer, ld1.l processType) {
            return new Initialized(answer, processType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public rd1.c getAnswer() {
            return this.answer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ld1.l getProcessType() {
            return this.processType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.answer == initialized.answer && this.processType == initialized.processType;
        }

        public int hashCode() {
            rd1.c cVar = this.answer;
            return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.processType.hashCode();
        }

        public String toString() {
            return "Initialized(answer=" + this.answer + ", processType=" + this.processType + ')';
        }
    }

    public /* synthetic */ h(rd1.c cVar, fr.k kVar) {
        this(cVar);
    }

    private h(rd1.c cVar) {
        this.answer = cVar;
    }
}
