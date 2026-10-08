package mj0;

import nj0.CitizenshipDictionaryDto;
import p071kotlin.Metadata;
import wi0.CitizenshipDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnj0/i;", "Lwi0/a;", "a", "(Lnj0/i;)Lwi0/a;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final CitizenshipDictionary a(CitizenshipDictionaryDto citizenshipDictionaryDto) {
        return new CitizenshipDictionary(citizenshipDictionaryDto.getIsoCode(), citizenshipDictionaryDto.getName());
    }
}
