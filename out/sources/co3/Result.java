package co3;

import eo3.VerificationSelector;
import java.util.List;
import k34.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lco3/g;", "", "Lco3/g$a;", "resultType", "<init>", "(Lco3/g$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/g$a;", "()Lco3/g$a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a resultType;

    /* JADX INFO: renamed from: co3.g$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lco3/g$a;", "", "<init>", "()V", "a", "b", "Lco3/g$a$a;", "Lco3/g$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: co3.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lco3/g$a$a;", "Lco3/g$a;", "Loq/r;", "Lk34/a0;", "scope", "", "Lco3/q;", "list", "Lco3/n;", "subDocument", "subDocumentList", "Leo3/v;", "verificationSelector", "<init>", "(Loq/r;Ljava/util/List;Lco3/n;Ljava/util/List;Leo3/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loq/r;", "b", "()Loq/r;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lco3/n;", "()Lco3/n;", "d", "e", "Leo3/v;", "()Leo3/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Main extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final oq.r<a0, a0> scope;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<q> list;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final n subDocument;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n> subDocumentList;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final VerificationSelector verificationSelector;

            /* JADX WARN: Multi-variable type inference failed */
            public Main(oq.r<? extends a0, ? extends a0> rVar, List<? extends q> list, n nVar, List<? extends n> list2, VerificationSelector verificationSelector) {
                super(null);
                this.scope = rVar;
                this.list = list;
                this.subDocument = nVar;
                this.subDocumentList = list2;
                this.verificationSelector = verificationSelector;
            }

            public final List<q> a() {
                return this.list;
            }

            public final oq.r<a0, a0> b() {
                return this.scope;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n getSubDocument() {
                return this.subDocument;
            }

            public final List<n> d() {
                return this.subDocumentList;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final VerificationSelector getVerificationSelector() {
                return this.verificationSelector;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Main)) {
                    return false;
                }
                Main main = (Main) other;
                return fr.t.c(this.scope, main.scope) && fr.t.c(this.list, main.list) && fr.t.c(this.subDocument, main.subDocument) && fr.t.c(this.subDocumentList, main.subDocumentList) && fr.t.c(this.verificationSelector, main.verificationSelector);
            }

            public int hashCode() {
                int iHashCode = ((this.scope.hashCode() * 31) + this.list.hashCode()) * 31;
                n nVar = this.subDocument;
                int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
                List<n> list = this.subDocumentList;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                VerificationSelector verificationSelector = this.verificationSelector;
                return iHashCode3 + (verificationSelector != null ? verificationSelector.hashCode() : 0);
            }

            public String toString() {
                return "Main(scope=" + this.scope + ", list=" + this.list + ", subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ", verificationSelector=" + this.verificationSelector + ')';
            }
        }

        /* JADX INFO: renamed from: co3.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lco3/g$a$b;", "Lco3/g$a;", "", "Lco3/q;", "list", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Sub extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<q> list;

            /* JADX WARN: Multi-variable type inference failed */
            public Sub(List<? extends q> list) {
                super(null);
                this.list = list;
            }

            public final List<q> a() {
                return this.list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Sub) && fr.t.c(this.list, ((Sub) other).list);
            }

            public int hashCode() {
                return this.list.hashCode();
            }

            public String toString() {
                return "Sub(list=" + this.list + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public Result(a aVar) {
        this.resultType = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getResultType() {
        return this.resultType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Result) && fr.t.c(this.resultType, ((Result) other).resultType);
    }

    public int hashCode() {
        return this.resultType.hashCode();
    }

    public String toString() {
        return "Result(resultType=" + this.resultType + ')';
    }
}
