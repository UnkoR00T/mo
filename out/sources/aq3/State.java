package aq3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: aq3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Laq3/b;", "", "Loo0/k;", "category", "", "titleValue", "Lhz/b;", "titleValidationState", "descriptionValue", "descriptionValidationState", "<init>", "(Loo0/k;Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;)V", "a", "(Loo0/k;Ljava/lang/String;Lhz/b;Ljava/lang/String;Lhz/b;)Laq3/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo0/k;", "c", "()Loo0/k;", "b", "Ljava/lang/String;", "g", "Lhz/b;", "f", "()Lhz/b;", "d", "e", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14133f = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final oo0.k category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b titleValidationState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String descriptionValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b descriptionValidationState;

    public State(oo0.k kVar, String str, hz.b bVar, String str2, hz.b bVar2) {
        this.category = kVar;
        this.titleValue = str;
        this.titleValidationState = bVar;
        this.descriptionValue = str2;
        this.descriptionValidationState = bVar2;
    }

    public static /* synthetic */ State b(State state, oo0.k kVar, String str, hz.b bVar, String str2, hz.b bVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            kVar = state.category;
        }
        if ((i15 & 2) != 0) {
            str = state.titleValue;
        }
        if ((i15 & 4) != 0) {
            bVar = state.titleValidationState;
        }
        if ((i15 & 8) != 0) {
            str2 = state.descriptionValue;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.descriptionValidationState;
        }
        hz.b bVar3 = bVar2;
        hz.b bVar4 = bVar;
        return state.a(kVar, str, bVar4, str2, bVar3);
    }

    public final State a(oo0.k category, String titleValue, hz.b titleValidationState, String descriptionValue, hz.b descriptionValidationState) {
        return new State(category, titleValue, titleValidationState, descriptionValue, descriptionValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final oo0.k getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getDescriptionValidationState() {
        return this.descriptionValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescriptionValue() {
        return this.descriptionValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.category == state.category && fr.t.c(this.titleValue, state.titleValue) && fr.t.c(this.titleValidationState, state.titleValidationState) && fr.t.c(this.descriptionValue, state.descriptionValue) && fr.t.c(this.descriptionValidationState, state.descriptionValidationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getTitleValidationState() {
        return this.titleValidationState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleValue() {
        return this.titleValue;
    }

    public int hashCode() {
        return (((((((this.category.hashCode() * 31) + this.titleValue.hashCode()) * 31) + this.titleValidationState.hashCode()) * 31) + this.descriptionValue.hashCode()) * 31) + this.descriptionValidationState.hashCode();
    }

    public String toString() {
        return "State(category=" + this.category + ", titleValue=" + this.titleValue + ", titleValidationState=" + this.titleValidationState + ", descriptionValue=" + this.descriptionValue + ", descriptionValidationState=" + this.descriptionValidationState + ')';
    }

    public /* synthetic */ State(oo0.k kVar, String str, hz.b bVar, String str2, hz.b bVar2, int i15, fr.k kVar2) {
        this(kVar, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2);
    }
}
