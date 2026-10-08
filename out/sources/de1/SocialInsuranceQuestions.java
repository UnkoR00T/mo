package de1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: de1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lde1/f;", "", "Lde1/g;", "firstAnswer", "secondAnswer", "thirdAnswer", "<init>", "(Lde1/g;Lde1/g;Lde1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lde1/g;", "()Lde1/g;", "b", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SocialInsuranceQuestions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g firstAnswer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g secondAnswer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g thirdAnswer;

    public SocialInsuranceQuestions(g gVar, g gVar2, g gVar3) {
        this.firstAnswer = gVar;
        this.secondAnswer = gVar2;
        this.thirdAnswer = gVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getFirstAnswer() {
        return this.firstAnswer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getSecondAnswer() {
        return this.secondAnswer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getThirdAnswer() {
        return this.thirdAnswer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialInsuranceQuestions)) {
            return false;
        }
        SocialInsuranceQuestions socialInsuranceQuestions = (SocialInsuranceQuestions) other;
        return this.firstAnswer == socialInsuranceQuestions.firstAnswer && this.secondAnswer == socialInsuranceQuestions.secondAnswer && this.thirdAnswer == socialInsuranceQuestions.thirdAnswer;
    }

    public int hashCode() {
        g gVar = this.firstAnswer;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        g gVar2 = this.secondAnswer;
        int iHashCode2 = (iHashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        g gVar3 = this.thirdAnswer;
        return iHashCode2 + (gVar3 != null ? gVar3.hashCode() : 0);
    }

    public String toString() {
        return "SocialInsuranceQuestions(firstAnswer=" + this.firstAnswer + ", secondAnswer=" + this.secondAnswer + ", thirdAnswer=" + this.thirdAnswer + ')';
    }
}
