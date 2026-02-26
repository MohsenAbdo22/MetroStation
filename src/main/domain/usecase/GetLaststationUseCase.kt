class GetLaststationUseCase(repo:Metrorepository) {
    operator fun invoke(line :MetroLine): String {
        return repo.GetStation()
            .filter { it.line == line }
            .maxBy { it.order }
            .name
    }

}