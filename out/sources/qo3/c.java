package qo3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import ko3.SendDocumentInfoState;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqo3/c;", "Ll00/e;", "Lqo3/c$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqo3/c$a;", "", "a", "b", "Lqo3/c$a$a;", "Lqo3/c$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: qo3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqo3/c$a$a;", "Lqo3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4230a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4230a f167733a = new C4230a();

            private C4230a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4230a);
            }

            public int hashCode() {
                return -1894499033;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: qo3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b*\u0010/R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b\"\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b&\u00105¨\u00066"}, d2 = {"Lqo3/c$a$b;", "Lqo3/c$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "process", "Lh30/a;", "nextButtonData", "Ln50/k;", "entity", "bulletList", "Lko3/a;", "sendDocumentInfoState", "Ln30/b;", "documentSectionData", "<init>", "(Li50/a;Ler/a;Lmx/a;Lh30/a;Ln50/k;Ln50/k;Lko3/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "f", "()Ler/a;", "c", "Lmx/a;", "g", "()Lmx/a;", "d", "Lh30/a;", "e", "()Lh30/a;", "Ln50/k;", "()Ln50/k;", "Lko3/a;", "getSendDocumentInfoState", "()Lko3/a;", "h", "Ln30/b;", "()Ln30/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label process;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k entity;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k bulletList;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final SendDocumentInfoState sendDocumentInfoState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData documentSectionData;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Label label, ButtonData buttonData, n50.k kVar, n50.k kVar2, SendDocumentInfoState sendDocumentInfoState, CardListData cardListData) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBackClick = aVar;
                this.process = label;
                this.nextButtonData = buttonData;
                this.entity = kVar;
                this.bulletList = kVar2;
                this.sendDocumentInfoState = sendDocumentInfoState;
                this.documentSectionData = cardListData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getBulletList() {
                return this.bulletList;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getDocumentSectionData() {
                return this.documentSectionData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getEntity() {
                return this.entity;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.process, initialized.process) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && fr.t.c(this.entity, initialized.entity) && fr.t.c(this.bulletList, initialized.bulletList) && fr.t.c(this.sendDocumentInfoState, initialized.sendDocumentInfoState) && fr.t.c(this.documentSectionData, initialized.documentSectionData);
            }

            public final er.a<i0> f() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getProcess() {
                return this.process;
            }

            public int hashCode() {
                return (((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.process.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.entity.hashCode()) * 31) + this.bulletList.hashCode()) * 31) + this.sendDocumentInfoState.hashCode()) * 31) + this.documentSectionData.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", process=" + this.process + ", nextButtonData=" + this.nextButtonData + ", entity=" + this.entity + ", bulletList=" + this.bulletList + ", sendDocumentInfoState=" + this.sendDocumentInfoState + ", documentSectionData=" + this.documentSectionData + ')';
            }
        }
    }
}
