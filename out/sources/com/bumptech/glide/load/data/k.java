package com.bumptech.glide.load.data;

import ie.y;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f28844a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ce.b f28845a;

        public a(ce.b bVar) {
            this.f28845a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f28845a);
        }
    }

    public k(InputStream inputStream, ce.b bVar) {
        y yVar = new y(inputStream, bVar);
        this.f28844a = yVar;
        yVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f28844a.m();
    }

    public void c() {
        this.f28844a.h();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f28844a.reset();
        return this.f28844a;
    }
}
