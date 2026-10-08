package jh1;

import i50.BaseScaffoldData;
import j30.ButtonTextData;
import lh1.DocumentsEmptyScreenData;
import lh1.DocumentsListScreenModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljh1/w;", "Ll00/e;", "Ljh1/w$a;", "Loq/i0;", "n", "()V", "d", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w extends l00.e<a> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ljh1/w$a;", "", "b", "a", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: jh1.w$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljh1/w$a$a;", "Ljh1/w$a;", "Llh1/b;", "emptyScreenData", "<init>", "(Llh1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llh1/b;", "()Llh1/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f102994b = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentsEmptyScreenData emptyScreenData;

            public Empty(DocumentsEmptyScreenData documentsEmptyScreenData) {
                this.emptyScreenData = documentsEmptyScreenData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DocumentsEmptyScreenData getEmptyScreenData() {
                return this.emptyScreenData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Empty) && fr.t.c(this.emptyScreenData, ((Empty) other).emptyScreenData);
            }

            public int hashCode() {
                return this.emptyScreenData.hashCode();
            }

            public String toString() {
                return "Empty(emptyScreenData=" + this.emptyScreenData + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljh1/w$a$b;", "Ljh1/w$a;", "<init>", "()V", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102996a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: jh1.w$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljh1/w$a$c;", "Ljh1/w$a;", "Llh1/d;", "documentsModel", "<init>", "(Llh1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llh1/d;", "()Llh1/d;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f102997b = (ButtonTextData.f99099f | c30.b.a.f22953l) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentsListScreenModel documentsModel;

            public Initialized(DocumentsListScreenModel documentsListScreenModel) {
                this.documentsModel = documentsListScreenModel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DocumentsListScreenModel getDocumentsModel() {
                return this.documentsModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && fr.t.c(this.documentsModel, ((Initialized) other).documentsModel);
            }

            public int hashCode() {
                return this.documentsModel.hashCode();
            }

            public String toString() {
                return "Initialized(documentsModel=" + this.documentsModel + ')';
            }
        }
    }

    void d();

    void n();
}
