package ly1;

import er.l;
import er.p;
import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$\"%B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0019\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lly1/f;", "Lxw/f;", "Lly1/f$c;", "Lky1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lgy1/a;", "Lly1/f$a;", "config", "Lkotlin/Function1;", "Lyw1/a;", "Loq/i0;", "unlockAction", "Lkotlin/Function2;", "", "changeAction", "Liy1/c;", "errorAction", "Ln50/g;", "q", "(Lgy1/a;Lly1/f$a;Ler/l;Ler/p;Ler/l;)Ln50/g;", "Lgy1/a$a;", "Lly1/f$b;", "s", "(Lgy1/a$a;Lly1/f$a;Ler/l;Ler/p;Ler/l;)Lly1/f$b;", "", "attemptCounter", "m", "(I)Z", "params", "l", "(Lly1/f$c;)Lky1/c$a;", "a", "Lmx/c;", "c", "b", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, ky1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ly1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lly1/f$a;", "", "Lmx/a;", "unlockTitle", "changeTitle", "errorTitle", "description", "Lyw1/a;", "certificateType", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lyw1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "d", "Lyw1/a;", "()Lyw1/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final /* data */ class CertStatusSingleCardDataConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label unlockTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label changeTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw1.a certificateType;

        public CertStatusSingleCardDataConfig(Label label, Label label2, Label label3, Label label4, yw1.a aVar) {
            this.unlockTitle = label;
            this.changeTitle = label2;
            this.errorTitle = label3;
            this.description = label4;
            this.certificateType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yw1.a getCertificateType() {
            return this.certificateType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getChangeTitle() {
            return this.changeTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getUnlockTitle() {
            return this.unlockTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CertStatusSingleCardDataConfig)) {
                return false;
            }
            CertStatusSingleCardDataConfig certStatusSingleCardDataConfig = (CertStatusSingleCardDataConfig) other;
            return t.c(this.unlockTitle, certStatusSingleCardDataConfig.unlockTitle) && t.c(this.changeTitle, certStatusSingleCardDataConfig.changeTitle) && t.c(this.errorTitle, certStatusSingleCardDataConfig.errorTitle) && t.c(this.description, certStatusSingleCardDataConfig.description) && this.certificateType == certStatusSingleCardDataConfig.certificateType;
        }

        public int hashCode() {
            return (((((((this.unlockTitle.hashCode() * 31) + this.changeTitle.hashCode()) * 31) + this.errorTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.certificateType.hashCode();
        }

        public String toString() {
            return "CertStatusSingleCardDataConfig(unlockTitle=" + this.unlockTitle + ", changeTitle=" + this.changeTitle + ", errorTitle=" + this.errorTitle + ", description=" + this.description + ", certificateType=" + this.certificateType + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lly1/f$b;", "", "Lly1/f$b$a;", "data", "<init>", "(Lly1/f$b$a;)V", "a", "Lly1/f$b$a;", "()Lly1/f$b$a;", "d", "b", "c", "Lly1/f$b$b;", "Lly1/f$b$c;", "Lly1/f$b$d;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActionTypeData data;

        /* JADX INFO: renamed from: ly1.f$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lly1/f$b$a;", "", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "action", "<init>", "(Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ler/a;", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionTypeData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> action;

            public ActionTypeData(Label label, Label label2, er.a<i0> aVar) {
                this.title = label;
                this.description = label2;
                this.action = aVar;
            }

            public final er.a<i0> a() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionTypeData)) {
                    return false;
                }
                ActionTypeData actionTypeData = (ActionTypeData) other;
                return t.c(this.title, actionTypeData.title) && t.c(this.description, actionTypeData.description) && t.c(this.action, actionTypeData.action);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.action.hashCode();
            }

            public String toString() {
                return "ActionTypeData(title=" + this.title + ", description=" + this.description + ", action=" + this.action + ')';
            }
        }

        /* JADX INFO: renamed from: ly1.f$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lly1/f$b$b;", "Lly1/f$b;", "Lly1/f$b$a;", "data", "<init>", "(Lly1/f$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lly1/f$b$a;", "a", "()Lly1/f$b$a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Change extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ActionTypeData data;

            public Change(ActionTypeData actionTypeData) {
                super(actionTypeData, null);
                this.data = actionTypeData;
            }

            @Override // ly1.f.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ActionTypeData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Change) && t.c(this.data, ((Change) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Change(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: ly1.f$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lly1/f$b$c;", "Lly1/f$b;", "Lly1/f$b$a;", "data", "<init>", "(Lly1/f$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lly1/f$b$a;", "a", "()Lly1/f$b$a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ActionTypeData data;

            public Error(ActionTypeData actionTypeData) {
                super(actionTypeData, null);
                this.data = actionTypeData;
            }

            @Override // ly1.f.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ActionTypeData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && t.c(this.data, ((Error) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: ly1.f$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lly1/f$b$d;", "Lly1/f$b;", "Lly1/f$b$a;", "data", "<init>", "(Lly1/f$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lly1/f$b$a;", "a", "()Lly1/f$b$a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unlock extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ActionTypeData data;

            public Unlock(ActionTypeData actionTypeData) {
                super(actionTypeData, null);
                this.data = actionTypeData;
            }

            @Override // ly1.f.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public ActionTypeData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unlock) && t.c(this.data, ((Unlock) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Unlock(data=" + this.data + ')';
            }
        }

        public /* synthetic */ b(ActionTypeData actionTypeData, k kVar) {
            this(actionTypeData);
        }

        /* JADX INFO: renamed from: a */
        public abstract ActionTypeData getData();

        private b(ActionTypeData actionTypeData) {
            this.data = actionTypeData;
        }
    }

    /* JADX INFO: renamed from: ly1.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b)\u0010,R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006-"}, d2 = {"Lly1/f$c;", "", "Lky1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "goToInfoPage", "onBackAction", "onCloseAction", "Lkotlin/Function2;", "Lyw1/a;", "", "onChangePinAction", "Lkotlin/Function1;", "onUnlockAction", "Liy1/c;", "onDisplayErrorAction", "goToCertListAction", "<init>", "(Lky1/b;Ler/a;Ler/a;Ler/a;Ler/p;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lky1/b;", "h", "()Lky1/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/p;", "()Ler/p;", "f", "Ler/l;", "g", "()Ler/l;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ky1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToInfoPage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<yw1.a, Boolean, i0> onChangePinAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<yw1.a, i0> onUnlockAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<iy1.c, i0> onDisplayErrorAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCertListAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ky1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, p<? super yw1.a, ? super Boolean, i0> pVar, l<? super yw1.a, i0> lVar, l<? super iy1.c, i0> lVar2, er.a<i0> aVar4) {
            this.state = bVar;
            this.goToInfoPage = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
            this.onChangePinAction = pVar;
            this.onUnlockAction = lVar;
            this.onDisplayErrorAction = lVar2;
            this.goToCertListAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.goToCertListAction;
        }

        public final er.a<i0> b() {
            return this.goToInfoPage;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final p<yw1.a, Boolean, i0> d() {
            return this.onChangePinAction;
        }

        public final er.a<i0> e() {
            return this.onCloseAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.goToInfoPage, params.goToInfoPage) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onChangePinAction, params.onChangePinAction) && t.c(this.onUnlockAction, params.onUnlockAction) && t.c(this.onDisplayErrorAction, params.onDisplayErrorAction) && t.c(this.goToCertListAction, params.goToCertListAction);
        }

        public final l<iy1.c, i0> f() {
            return this.onDisplayErrorAction;
        }

        public final l<yw1.a, i0> g() {
            return this.onUnlockAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ky1.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.goToInfoPage.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onChangePinAction.hashCode()) * 31) + this.onUnlockAction.hashCode()) * 31) + this.onDisplayErrorAction.hashCode()) * 31) + this.goToCertListAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToInfoPage=" + this.goToInfoPage + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onChangePinAction=" + this.onChangePinAction + ", onUnlockAction=" + this.onUnlockAction + ", onDisplayErrorAction=" + this.onDisplayErrorAction + ", goToCertListAction=" + this.goToCertListAction + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final boolean m(int attemptCounter) {
        return 1 <= attemptCounter && attemptCounter < 4;
    }

    private final DefaultSingleCardData q(final gy1.a aVar, CertStatusSingleCardDataConfig certStatusSingleCardDataConfig, l<? super yw1.a, i0> lVar, p<? super yw1.a, ? super Boolean, i0> pVar, final l<? super iy1.c, i0> lVar2) {
        b error;
        if (aVar instanceof gy1.a.CertificateData) {
            error = s((gy1.a.CertificateData) aVar, certStatusSingleCardDataConfig, lVar, pVar, lVar2);
        } else if (aVar instanceof gy1.a.Error) {
            error = new b.Error(new b.ActionTypeData(certStatusSingleCardDataConfig.getErrorTitle(), certStatusSingleCardDataConfig.getDescription(), new er.a() { // from class: ly1.e
                @Override // er.a
                public final Object a() {
                    return f.r(lVar2, aVar);
                }
            }));
        } else {
            if (!t.c(aVar, gy1.a.c.f78260a)) {
                throw new oq.p();
            }
            error = null;
        }
        if (error == null) {
            return null;
        }
        return new DefaultSingleCardData(null, error.getData().a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(error.getData().getTitle(), null, null, 0, 0, null, 62, null)), new SingleCardLabel(error.getData().getDescription(), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, gy1.a aVar) {
        lVar.b(((gy1.a.Error) aVar).getErrorType());
        return i0.f148189a;
    }

    private final b s(final gy1.a.CertificateData certificateData, final CertStatusSingleCardDataConfig certStatusSingleCardDataConfig, final l<? super yw1.a, i0> lVar, final p<? super yw1.a, ? super Boolean, i0> pVar, final l<? super iy1.c, i0> lVar2) {
        if (!certificateData.getCertificateIsActivated()) {
            return new b.Change(new b.ActionTypeData(certStatusSingleCardDataConfig.getChangeTitle(), certStatusSingleCardDataConfig.getDescription(), new er.a() { // from class: ly1.a
                @Override // er.a
                public final Object a() {
                    return f.u(lVar2);
                }
            }));
        }
        if (m(certificateData.getCertificatePinCounter()) || !m(certificateData.getCertificatePukCounter())) {
            return (m(certificateData.getCertificatePinCounter()) || m(certificateData.getCertificatePukCounter())) ? new b.Change(new b.ActionTypeData(certStatusSingleCardDataConfig.getChangeTitle(), certStatusSingleCardDataConfig.getDescription(), new er.a() { // from class: ly1.d
                @Override // er.a
                public final Object a() {
                    return f.z(pVar, certStatusSingleCardDataConfig, this, certificateData);
                }
            })) : new b.Error(new b.ActionTypeData(certStatusSingleCardDataConfig.getChangeTitle(), certStatusSingleCardDataConfig.getDescription(), new er.a() { // from class: ly1.c
                @Override // er.a
                public final Object a() {
                    return f.x(lVar2);
                }
            }));
        }
        return new b.Unlock(new b.ActionTypeData(certStatusSingleCardDataConfig.getUnlockTitle(), certStatusSingleCardDataConfig.getDescription(), new er.a() { // from class: ly1.b
            @Override // er.a
            public final Object a() {
                return f.v(lVar, certStatusSingleCardDataConfig);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar) {
        lVar.b(iy1.c.b.CERTIFICATE_INACTIVE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, CertStatusSingleCardDataConfig certStatusSingleCardDataConfig) {
        lVar.b(certStatusSingleCardDataConfig.getCertificateType());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar) {
        lVar.b(iy1.c.b.PIN_AND_PUK_BLOCKED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(p pVar, CertStatusSingleCardDataConfig certStatusSingleCardDataConfig, f fVar, gy1.a.CertificateData certificateData) {
        pVar.B(certStatusSingleCardDataConfig.getCertificateType(), Boolean.valueOf(fVar.m(certificateData.getCertificatePukCounter())));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ky1.c.a b(Params params) {
        ky1.b state = params.getState();
        if (t.c(state, ky1.b.C2744b.f113149a)) {
            return ky1.c.a.b.f113152a;
        }
        if (!(state instanceof ky1.b.Initialized)) {
            if (state instanceof ky1.b.Error) {
                return new ky1.c.a.Error(((ky1.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        return new ky1.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(j0.f120775q), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(j0.G2), v.s(q(((ky1.b.Initialized) params.getState()).getELayerData().getAuthenticationCert(), new CertStatusSingleCardDataConfig(this.labelProvider.c(j0.H2), this.labelProvider.c(j0.B2), this.labelProvider.c(j0.B2), this.labelProvider.c(j0.A2), yw1.a.AUTHENTICATION), params.g(), params.d(), params.f()), q(((ky1.b.Initialized) params.getState()).getELayerData().getAuthorizationCert(), new CertStatusSingleCardDataConfig(this.labelProvider.c(j0.I2), this.labelProvider.c(j0.D2), this.labelProvider.c(j0.D2), this.labelProvider.c(j0.C2), yw1.a.AUTHORIZATION), params.g(), params.d(), params.f()), new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j0.F2), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(j0.E2), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null)), params.e());
    }
}
