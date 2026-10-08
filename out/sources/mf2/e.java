package mf2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import of2.SummarySectionCardListData;
import of2.SummarySectionSingleCardData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmf2/e;", "Ll00/e;", "Lmf2/e$a;", "a", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lmf2/e$a;", "", "b", "f", "c", "d", "e", "a", "Lmf2/e$a$a;", "Lmf2/e$a$b;", "Lmf2/e$a$c;", "Lmf2/e$a$d;", "Lmf2/e$a$e;", "Lmf2/e$a$f;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mf2.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmf2/e$a$a;", "Lmf2/e$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmf2/e$a$b;", "Lmf2/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f126164a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 426424254;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: mf2.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lmf2/e$a$c;", "Lmf2/e$a;", "Li50/a;", "scaffoldData", "Ln30/b;", "providerList", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ln30/b;", "()Ln30/b;", "Ler/a;", "()Ler/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProviderList implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f126165d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData providerList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public ProviderList(BaseScaffoldData baseScaffoldData, CardListData cardListData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.providerList = cardListData;
                this.onBackAction = aVar;
            }

            public final er.a<oq.i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getProviderList() {
                return this.providerList;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProviderList)) {
                    return false;
                }
                ProviderList providerList = (ProviderList) other;
                return fr.t.c(this.scaffoldData, providerList.scaffoldData) && fr.t.c(this.providerList, providerList.providerList) && fr.t.c(this.onBackAction, providerList.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.providerList.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "ProviderList(scaffoldData=" + this.scaffoldData + ", providerList=" + this.providerList + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: mf2.e$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lmf2/e$a$d;", "Lmf2/e$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "phoneNumberStatement", "emailStatement", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ler/a;", "()Ler/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StatementFullText implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f126169e = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label phoneNumberStatement;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label emailStatement;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public StatementFullText(BaseScaffoldData baseScaffoldData, Label label, Label label2, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.phoneNumberStatement = label;
                this.emailStatement = label2;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getEmailStatement() {
                return this.emailStatement;
            }

            public final er.a<oq.i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getPhoneNumberStatement() {
                return this.phoneNumberStatement;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatementFullText)) {
                    return false;
                }
                StatementFullText statementFullText = (StatementFullText) other;
                return fr.t.c(this.scaffoldData, statementFullText.scaffoldData) && fr.t.c(this.phoneNumberStatement, statementFullText.phoneNumberStatement) && fr.t.c(this.emailStatement, statementFullText.emailStatement) && fr.t.c(this.onBackAction, statementFullText.onBackAction);
            }

            public int hashCode() {
                int iHashCode = this.scaffoldData.hashCode() * 31;
                Label label = this.phoneNumberStatement;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                Label label2 = this.emailStatement;
                return ((iHashCode2 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "StatementFullText(scaffoldData=" + this.scaffoldData + ", phoneNumberStatement=" + this.phoneNumberStatement + ", emailStatement=" + this.emailStatement + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: mf2.e$a$e, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmf2/e$a$e;", "Lmf2/e$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "Lkotlin/Function0;", "onBackAction", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "c", "Ler/a;", "getOnBackAction", "()Ler/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f126174d = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public Success(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onBackAction = aVar;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.scaffoldData, success.scaffoldData) && fr.t.c(this.iconPageData, success.iconPageData) && fr.t.c(this.onBackAction, success.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "Success(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: mf2.e$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b \u0010+R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b(\u00100R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b2\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b$\u00106¨\u00067"}, d2 = {"Lmf2/e$a$f;", "Lmf2/e$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Lof2/b;", "yourData", "address", "providers", "reason", "Lof2/a;", "speedParams", "contactDetails", "statementLabel", "Ls50/a;", "statementSwitch", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lmx/a;Lof2/b;Lof2/b;Lof2/b;Lof2/b;Lof2/a;Lof2/a;Lmx/a;Ls50/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lmx/a;", "j", "()Lmx/a;", "c", "Lof2/b;", "k", "()Lof2/b;", "d", "e", "g", "Lof2/a;", "()Lof2/a;", "h", "i", "Ls50/a;", "()Ls50/a;", "Lh30/a;", "()Lh30/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SummaryData implements a {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f126178l = s50.a.f177982i | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionSingleCardData yourData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionSingleCardData address;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionSingleCardData providers;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionSingleCardData reason;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionCardListData speedParams;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionCardListData contactDetails;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementLabel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final s50.a statementSwitch;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            public SummaryData(BaseScaffoldData baseScaffoldData, Label label, SummarySectionSingleCardData summarySectionSingleCardData, SummarySectionSingleCardData summarySectionSingleCardData2, SummarySectionSingleCardData summarySectionSingleCardData3, SummarySectionSingleCardData summarySectionSingleCardData4, SummarySectionCardListData summarySectionCardListData, SummarySectionCardListData summarySectionCardListData2, Label label2, s50.a aVar, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.yourData = summarySectionSingleCardData;
                this.address = summarySectionSingleCardData2;
                this.providers = summarySectionSingleCardData3;
                this.reason = summarySectionSingleCardData4;
                this.speedParams = summarySectionCardListData;
                this.contactDetails = summarySectionCardListData2;
                this.statementLabel = label2;
                this.statementSwitch = aVar;
                this.buttonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SummarySectionSingleCardData getAddress() {
                return this.address;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final SummarySectionCardListData getContactDetails() {
                return this.contactDetails;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final SummarySectionSingleCardData getProviders() {
                return this.providers;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final SummarySectionSingleCardData getReason() {
                return this.reason;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SummaryData)) {
                    return false;
                }
                SummaryData summaryData = (SummaryData) other;
                return fr.t.c(this.scaffoldData, summaryData.scaffoldData) && fr.t.c(this.title, summaryData.title) && fr.t.c(this.yourData, summaryData.yourData) && fr.t.c(this.address, summaryData.address) && fr.t.c(this.providers, summaryData.providers) && fr.t.c(this.reason, summaryData.reason) && fr.t.c(this.speedParams, summaryData.speedParams) && fr.t.c(this.contactDetails, summaryData.contactDetails) && fr.t.c(this.statementLabel, summaryData.statementLabel) && fr.t.c(this.statementSwitch, summaryData.statementSwitch) && fr.t.c(this.buttonData, summaryData.buttonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final SummarySectionCardListData getSpeedParams() {
                return this.speedParams;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getStatementLabel() {
                return this.statementLabel;
            }

            public int hashCode() {
                return (((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.yourData.hashCode()) * 31) + this.address.hashCode()) * 31) + this.providers.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.speedParams.hashCode()) * 31) + this.contactDetails.hashCode()) * 31) + this.statementLabel.hashCode()) * 31) + this.statementSwitch.hashCode()) * 31) + this.buttonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final s50.a getStatementSwitch() {
                return this.statementSwitch;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final SummarySectionSingleCardData getYourData() {
                return this.yourData;
            }

            public String toString() {
                return "SummaryData(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", yourData=" + this.yourData + ", address=" + this.address + ", providers=" + this.providers + ", reason=" + this.reason + ", speedParams=" + this.speedParams + ", contactDetails=" + this.contactDetails + ", statementLabel=" + this.statementLabel + ", statementSwitch=" + this.statementSwitch + ", buttonData=" + this.buttonData + ')';
            }
        }
    }
}
