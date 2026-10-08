package oe1;

import de1.SocialInsuranceQuestions;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oe1.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Loe1/m;", "", "Lde1/f;", "socialInsuranceQuestionsAnswer", "<init>", "(Lde1/f;)V", "a", "(Lde1/f;)Loe1/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lde1/f;", "b", "()Lde1/f;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SocialInsuranceQuestions socialInsuranceQuestionsAnswer;

    public State(SocialInsuranceQuestions socialInsuranceQuestions) {
        this.socialInsuranceQuestionsAnswer = socialInsuranceQuestions;
    }

    public final State a(SocialInsuranceQuestions socialInsuranceQuestionsAnswer) {
        return new State(socialInsuranceQuestionsAnswer);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SocialInsuranceQuestions getSocialInsuranceQuestionsAnswer() {
        return this.socialInsuranceQuestionsAnswer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && fr.t.c(this.socialInsuranceQuestionsAnswer, ((State) other).socialInsuranceQuestionsAnswer);
    }

    public int hashCode() {
        SocialInsuranceQuestions socialInsuranceQuestions = this.socialInsuranceQuestionsAnswer;
        if (socialInsuranceQuestions == null) {
            return 0;
        }
        return socialInsuranceQuestions.hashCode();
    }

    public String toString() {
        return "State(socialInsuranceQuestionsAnswer=" + this.socialInsuranceQuestionsAnswer + ')';
    }
}
