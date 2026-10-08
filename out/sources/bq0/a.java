package bq0;

import dq0.GroupedAvailableDefenceTrainingsResponse;
import dq0.RegisterForDefenceTrainingResponseDto;
import dq0.RegisterForDefenceTrainingSignedRequestDto;
import dq0.UnregisterFromDefenceTrainingSignedRequestDto;
import dq0.UserDefenceTrainingsRegistrationsSummaryDto;
import ge4.x;
import ie4.f;
import ie4.o;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lbq0/a;", "", "Lge4/x;", "Ldq0/j;", "c", "(Ltq/e;)Ljava/lang/Object;", "Ldq0/r0;", "a", "Ldq0/q;", "registerForDefenceTrainingSignedRequestDto", "Ldq0/p;", "b", "(Ldq0/q;Ltq/e;)Ljava/lang/Object;", "Ldq0/m0;", "unregisterFromDefenceTrainingSignedRequestDto", "Loq/i0;", "d", "(Ldq0/m0;Ltq/e;)Ljava/lang/Object;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("military/mobile/api/military/trainings/registrations")
    Object a(e<? super x<UserDefenceTrainingsRegistrationsSummaryDto>> eVar);

    @o("military/mobile/api/military/trainings/register")
    Object b(@ie4.a RegisterForDefenceTrainingSignedRequestDto registerForDefenceTrainingSignedRequestDto, e<? super x<RegisterForDefenceTrainingResponseDto>> eVar);

    @f("military/mobile/api/military/trainings/grouped-by-type")
    Object c(e<? super x<GroupedAvailableDefenceTrainingsResponse>> eVar);

    @o("military/mobile/api/military/trainings/unregister")
    Object d(@ie4.a UnregisterFromDefenceTrainingSignedRequestDto unregisterFromDefenceTrainingSignedRequestDto, e<? super x<i0>> eVar);
}
