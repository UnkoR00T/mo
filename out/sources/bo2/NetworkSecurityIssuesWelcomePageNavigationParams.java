package bo2;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bo2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbo2/b;", "", "Lbo2/e;", "pageType", "Lmx/a;", "topBarTitle", "Lco2/a;", "nextDestination", "<init>", "(Lbo2/e;Lmx/a;Lco2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbo2/e;", "b", "()Lbo2/e;", "Lmx/a;", "c", "()Lmx/a;", "Lco2/a;", "()Lco2/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NetworkSecurityIssuesWelcomePageNavigationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e pageType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topBarTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final co2.a nextDestination;

    public NetworkSecurityIssuesWelcomePageNavigationParams(e eVar, Label label, co2.a aVar) {
        this.pageType = eVar;
        this.topBarTitle = label;
        this.nextDestination = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final co2.a getNextDestination() {
        return this.nextDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTopBarTitle() {
        return this.topBarTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSecurityIssuesWelcomePageNavigationParams)) {
            return false;
        }
        NetworkSecurityIssuesWelcomePageNavigationParams networkSecurityIssuesWelcomePageNavigationParams = (NetworkSecurityIssuesWelcomePageNavigationParams) other;
        return this.pageType == networkSecurityIssuesWelcomePageNavigationParams.pageType && t.c(this.topBarTitle, networkSecurityIssuesWelcomePageNavigationParams.topBarTitle) && this.nextDestination == networkSecurityIssuesWelcomePageNavigationParams.nextDestination;
    }

    public int hashCode() {
        return (((this.pageType.hashCode() * 31) + this.topBarTitle.hashCode()) * 31) + this.nextDestination.hashCode();
    }

    public String toString() {
        return "NetworkSecurityIssuesWelcomePageNavigationParams(pageType=" + this.pageType + ", topBarTitle=" + this.topBarTitle + ", nextDestination=" + this.nextDestination + ')';
    }
}
