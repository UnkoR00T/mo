package ti1;

import p071kotlin.Metadata;
import wi1.g;
import wi1.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lti1/a;", "", "<init>", "()V", "Laq0/a;", "beAvailableDefenceTrainings", "Laq0/d;", "beGetUserDefenceTrainingsRegistrations", "Lwi1/c;", "a", "(Laq0/a;Laq0/d;)Lwi1/c;", "Luy/b;", "distanceCalculator", "Lwi1/g;", "c", "(Luy/b;)Lwi1/g;", "Laq0/e;", "bERegisterForDefenceTrainingUC", "Lwz3/d;", "getBase64SignedValueUseCase", "Lwz3/e;", "getChallengeUC", "Lwi1/e;", "b", "(Laq0/e;Lwz3/d;Lwz3/e;)Lwi1/e;", "Laq0/g;", "beUnregisterForDefenceTrainingUC", "Lwi1/h;", "d", "(Laq0/g;Lwz3/d;Lwz3/e;)Lwi1/h;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final wi1.c a(aq0.a beAvailableDefenceTrainings, aq0.d beGetUserDefenceTrainingsRegistrations) {
        return new wi1.c(beAvailableDefenceTrainings, beGetUserDefenceTrainingsRegistrations);
    }

    public final wi1.e b(aq0.e bERegisterForDefenceTrainingUC, wz3.d getBase64SignedValueUseCase, wz3.e getChallengeUC) {
        return new wi1.e(bERegisterForDefenceTrainingUC, getBase64SignedValueUseCase, getChallengeUC);
    }

    public final g c(uy.b distanceCalculator) {
        return new g(distanceCalculator);
    }

    public final h d(aq0.g beUnregisterForDefenceTrainingUC, wz3.d getBase64SignedValueUseCase, wz3.e getChallengeUC) {
        return new h(beUnregisterForDefenceTrainingUC, getChallengeUC, getBase64SignedValueUseCase);
    }
}
