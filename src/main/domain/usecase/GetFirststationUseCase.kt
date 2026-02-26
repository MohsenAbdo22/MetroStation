class GetFirststationUseCase(repo: StationRepository) {
   operator fun invoke(line :MetroLine): String {
        return repo.GetStation()
            .filter { it.line == line }
            .minBy { it.order }
            .name
    }
}