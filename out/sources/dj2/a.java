package dj2;

import iy.b0;
import iy.c0;
import o34.b;
import o34.c;
import p071kotlin.Metadata;
import vh2.RefugeeData;
import vh2.RefugeeWrapped;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvh2/e;", "Lo34/c;", "c", "(Lvh2/e;)Lo34/c;", "Lxh2/a;", "Lo34/b;", "b", "(Lxh2/a;)Lo34/b;", "Lvh2/d;", "Lo34/a;", "a", "(Lvh2/d;)Lo34/a;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final o34.a a(RefugeeData refugeeData) {
        String birthDate = refugeeData.getBirthDate();
        b0 b0VarG = birthDate != null ? c0.g(birthDate) : null;
        String birthPlace = refugeeData.getBirthPlace();
        b0 b0VarG2 = birthPlace != null ? c0.g(birthPlace) : null;
        String birthCountry = refugeeData.getBirthCountry();
        b0 b0VarG3 = birthCountry != null ? c0.g(birthCountry) : null;
        String sex = refugeeData.getSex();
        b0 b0VarG4 = sex != null ? c0.g(sex) : null;
        String nationality = refugeeData.getNationality();
        b0 b0VarG5 = nationality != null ? c0.g(nationality) : null;
        String expiryDate = refugeeData.getExpiryDate();
        String refugeeStatus = refugeeData.getRefugeeStatus();
        b0 b0VarG6 = refugeeStatus != null ? c0.g(refugeeStatus) : null;
        String picture = refugeeData.getPicture();
        b0 b0VarG7 = picture != null ? c0.g(picture) : null;
        String firstName = refugeeData.getFirstName();
        b0 b0VarG8 = firstName != null ? c0.g(firstName) : null;
        String secondName = refugeeData.getSecondName();
        b0 b0VarG9 = secondName != null ? c0.g(secondName) : null;
        String surname = refugeeData.getSurname();
        b0 b0VarG10 = surname != null ? c0.g(surname) : null;
        String id5 = refugeeData.getId();
        String familyName = refugeeData.getFamilyName();
        b0 b0VarG11 = familyName != null ? c0.g(familyName) : null;
        String pesel = refugeeData.getPesel();
        return new o34.a(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, expiryDate, b0VarG6, b0VarG7, b0VarG8, b0VarG9, b0VarG10, id5, b0VarG11, pesel != null ? c0.g(pesel) : null);
    }

    public static final b b(xh2.a aVar) {
        return new b(aVar.b(), aVar.n(), aVar.i(), aVar.s(), aVar.m(), aVar.p(), aVar.o(), aVar.t(), aVar.c(), c0.g(aVar.j()), aVar.g(), aVar.a());
    }

    public static final c c(RefugeeWrapped refugeeWrapped) {
        return new c(b(refugeeWrapped.getDataHeader()), a(refugeeWrapped.getDataContainer()));
    }
}
