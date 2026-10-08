package w20;

import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import y30.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lw20/f;", "", "a", "b", "Lw20/f$a;", "Lw20/f$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw20/f$b;", "Lw20/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f209373a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -666148826;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: w20.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b\u001f\u0010&R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b'\u0010.R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b#\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b+\u00100¨\u00061"}, d2 = {"Lw20/f$a;", "Lw20/f;", "Li50/a;", "baseScaffoldData", "", "Lw20/b;", "topAdditionalData", "Lw20/d;", "giloshData", "additionalData", "Lc30/b;", "topAlertData", "Ly30/n$b;", "controllersData", "Lc30/b$c;", "alertData", "Lw20/e;", "documentLogo", "<init>", "(Li50/a;Ljava/util/List;Lw20/d;Ljava/util/List;Ljava/util/List;Ly30/n$b;Ljava/util/List;Lw20/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "getBaseScaffoldData", "()Li50/a;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lw20/d;", "e", "()Lw20/d;", "d", "g", "Ly30/n$b;", "()Ly30/n$b;", "Lw20/e;", "()Lw20/e;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<w20.b> topAdditionalData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentGiloshData giloshData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<w20.b> additionalData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<c30.b> topAlertData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n.Switch controllersData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<c30.b.c> alertData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, List<? extends w20.b> list, DocumentGiloshData documentGiloshData, List<? extends w20.b> list2, List<? extends c30.b> list3, n.Switch r15, List<c30.b.c> list4, e eVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.topAdditionalData = list;
            this.giloshData = documentGiloshData;
            this.additionalData = list2;
            this.topAlertData = list3;
            this.controllersData = r15;
            this.alertData = list4;
        }

        public final List<w20.b> a() {
            return this.additionalData;
        }

        public final List<c30.b.c> b() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n.Switch getControllersData() {
            return this.controllersData;
        }

        public final e d() {
            return null;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DocumentGiloshData getGiloshData() {
            return this.giloshData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.topAdditionalData, data.topAdditionalData) && t.c(this.giloshData, data.giloshData) && t.c(this.additionalData, data.additionalData) && t.c(this.topAlertData, data.topAlertData) && t.c(this.controllersData, data.controllersData) && t.c(this.alertData, data.alertData) && t.c(null, null);
        }

        public final List<w20.b> f() {
            return this.topAdditionalData;
        }

        public final List<c30.b> g() {
            return this.topAlertData;
        }

        public int hashCode() {
            int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.topAdditionalData.hashCode()) * 31;
            DocumentGiloshData documentGiloshData = this.giloshData;
            int iHashCode2 = (((iHashCode + (documentGiloshData == null ? 0 : documentGiloshData.hashCode())) * 31) + this.additionalData.hashCode()) * 31;
            List<c30.b> list = this.topAlertData;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            n.Switch r15 = this.controllersData;
            int iHashCode4 = (iHashCode3 + (r15 == null ? 0 : r15.hashCode())) * 31;
            List<c30.b.c> list2 = this.alertData;
            return (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", topAdditionalData=" + this.topAdditionalData + ", giloshData=" + this.giloshData + ", additionalData=" + this.additionalData + ", topAlertData=" + this.topAlertData + ", controllersData=" + this.controllersData + ", alertData=" + this.alertData + ", documentLogo=" + ((Object) null) + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, List list, DocumentGiloshData documentGiloshData, List list2, List list3, n.Switch r15, List list4, e eVar, int i15, k kVar) {
            this(baseScaffoldData, (i15 & 2) != 0 ? v.n() : list, documentGiloshData, list2, (i15 & 16) != 0 ? null : list3, (i15 & 32) != 0 ? null : r15, (i15 & 64) != 0 ? null : list4, (i15 & 128) != 0 ? null : eVar);
        }
    }
}
